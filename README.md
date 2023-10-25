# Mapbox Test

A test application for demonstrating issues with the Mapbox Android SDK.

## Setup

See https://docs.mapbox.com/android/maps/guides/install/#configure-credentials for how to get the required Mapbox credentials.

### Configure your secret token
Add your secret token to `«USER_HOME»/.gradle/gradle.properties`:
```
MAPBOX_DOWNLOADS_TOKEN=YOUR_SECRET_MAPBOX_ACCESS_TOKEN
```

### Configure your public token
Add a string resource named `mapbox_access_token` containing your Mapbox access token to  `app/src/main/res/values/strings.xml`:
```
<string name="mapbox_access_token">YOUR_MAPBOX_ACCESS_TOKEN</string>
```
