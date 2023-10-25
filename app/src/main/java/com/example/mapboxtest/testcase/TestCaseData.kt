package com.example.mapboxtest.testcase

data class TestCaseData(
    val title: String,
    val description: String,
    // Class of an activity to launch for this test case.
    val activityClass: Class<*>,
)