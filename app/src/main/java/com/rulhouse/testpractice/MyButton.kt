package com.rulhouse.testpractice

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics

@Composable
fun MyButton(
) {
    val text = remember { mutableStateOf("Not Yet Be Clicked.") }
    Button(
        modifier = Modifier.semantics { contentDescription = "Add to favorites" },
        onClick = {
            text.value = "It had been clicked."
        }
    ) {
        Text(
            modifier = Modifier.semantics { contentDescription = "Text which is clicked" },
            text = text.value
        )
    }
}