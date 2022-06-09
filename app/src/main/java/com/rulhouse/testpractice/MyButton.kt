package com.rulhouse.testpractice

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics

@Composable
fun MyButton(
) {
    val context = LocalContext.current

    val text = remember { mutableStateOf(context.getString(R.string.show_text_text_before_be_clicked)) }
    Button(
        modifier = Modifier.semantics { contentDescription = context.getString(R.string.button_to_change_text) },
        onClick = {
            text.value = context.getString(R.string.show_text_text_after_be_clicked)
        }
    ) {
        Text(
            modifier = Modifier.semantics { contentDescription = context.getString(R.string.show_text) },
            text = text.value
        )
    }
}