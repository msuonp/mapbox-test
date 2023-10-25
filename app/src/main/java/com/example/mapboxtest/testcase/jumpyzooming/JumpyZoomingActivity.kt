package com.example.mapboxtest.testcase.jumpyzooming

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import com.example.mapboxtest.ui.theme.MapboxTestTheme
import com.mapbox.geojson.Point
import com.mapbox.maps.MapView
import com.mapbox.maps.Style
import com.mapbox.maps.dsl.cameraOptions
import com.mapbox.maps.extension.style.sources.generated.rasterDemSource
import com.mapbox.maps.extension.style.style
import com.mapbox.maps.extension.style.terrain.generated.terrain

class JumpyZoomingActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MapboxTestTheme {
                AndroidView(
                    modifier = Modifier.fillMaxSize(),
                    factory = { context ->
                        MapView(context).apply {
                            val map = getMapboxMap()
                            map.loadStyle(
                                styleExtension = style(Style.SATELLITE_STREETS) {
                                    +rasterDemSource("TERRAIN_SOURCE") {
                                        url("mapbox://mapbox.mapbox-terrain-dem-v1")
                                    }
                                    +terrain("TERRAIN_SOURCE") {
                                        exaggeration(1.0)
                                    }
                                },
                                onStyleLoaded = {
                                    map.setCamera(
                                        cameraOptions {
                                            center(Point.fromLngLat(6.92, 45.90))
                                            zoom(11.8)
                                            bearing(43.1)
                                            pitch(65.0)
                                        }
                                    )
                                }
                            )

                            map.addOnCameraChangeListener {
                                Log.d("Map", map.cameraState.toString())
                            }
                        }
                    },
                    update = {
                    }
                )
            }
        }
    }
}