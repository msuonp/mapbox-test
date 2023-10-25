package com.example.mapboxtest.testcase

import androidx.compose.foundation.clickable
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mapboxtest.MainActivity

@Composable
fun TestCaseItem(
    testCase: TestCaseData,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    ListItem(
        headlineContent = {
            Text(testCase.title)
        },
        supportingContent = {
            Text(testCase.description)
        },
        trailingContent = {
            Icon(Icons.Default.KeyboardArrowRight, contentDescription = null)
        },
        modifier = modifier
            .clickable(onClick = onClick)
    )
}

@Preview
@Composable
fun TestCaseItemPreview() {
    TestCaseItem(
        testCase = TestCaseData(
            title = "Test case title",
            description = "Test case description",
            activityClass = MainActivity::class.java
        ),
        onClick = {}
    )
}