package com.rulhouse.testpractice

import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics

@Composable
fun MyButton(
) {
    Button(
        modifier = Modifier.semantics { contentDescription = "Add to favorites" },
        onClick = {

        }
    ) {

    }
}