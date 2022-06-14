package com.rulhouse.testpractice

import androidx.activity.ComponentActivity
import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.performClick
import org.junit.Rule
import org.junit.Test

class MyComposeTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    private val activity by lazy { composeTestRule.activity }

    @Test
    fun testButtonClick() {
        composeTestRule.setContent {
            MainScreen()
        }
        clickButton()
        assertShowText()
    }

    private fun clickButton() {
        composeTestRule.onNodeWithContentDescription(activity.getString(R.string.button_to_change_text))
            .performClick()
    }

    private fun assertShowText() {
        composeTestRule.onNodeWithContentDescription(activity.getString(R.string.show_text))
            .assertTextEquals(activity.getString(R.string.show_text_text_after_be_clicked))
    }

}