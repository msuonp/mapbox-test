package com.example.mapboxtest.testcase

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mapboxtest.MainActivity

@Composable
fun TestCaseList(
    testCases: List<TestCaseData>,
    onTestCaseClick: (TestCaseData) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        testCases.forEach { testCase ->
            TestCaseItem(
                testCase = testCase,
                onClick = { onTestCaseClick(testCase) }
            )
        }
    }
}

@Preview
@Composable
fun TestCaseListPreview() {
    TestCaseList(
        testCases = listOf(
            TestCaseData(
                title = "Test case 1 title",
                description = "Test case 1 description",
                activityClass = MainActivity::class.java
            ),
            TestCaseData(
                title = "Test case 2 title",
                description = "Test case 2 description",
                activityClass = MainActivity::class.java
            ),
            TestCaseData(
                title = "Test case 3 title",
                description = "Test case 3 description",
                activityClass = MainActivity::class.java
            )
        ),
        onTestCaseClick = {}
    )
}