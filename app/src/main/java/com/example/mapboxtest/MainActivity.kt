package com.example.mapboxtest

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.mapboxtest.testcase.TestCaseData
import com.example.mapboxtest.testcase.TestCaseList
import com.example.mapboxtest.testcase.jumpyzooming.JumpyZoomingActivity
import com.example.mapboxtest.ui.theme.MapboxTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MapboxTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    TestCaseList(
                        testCases = listOf(
                            TestCaseData(
                                title = "Jumpy zooming",
                                description = "Zooming in and out near terrain peaks works badly.",
                                activityClass = JumpyZoomingActivity::class.java
                            )
                        ),
                        onTestCaseClick = { testCase ->
                            startActivity(Intent(this, testCase.activityClass))
                        }
                    )
                }
            }
        }
    }
}