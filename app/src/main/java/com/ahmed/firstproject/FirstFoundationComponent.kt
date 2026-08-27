package com.ahmed.firstproject

import androidx.compose.foundation.text.BasicTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun FirstFoundationComponent() {
    var textValue: String by remember { mutableStateOf("Hello") }

    BasicTextField(
        value = textValue,
        onValueChange = {
            textValue = it


        }
    )


}

@Preview
@Composable
private fun FirstFoundationComponentPreview() {
    FirstFoundationComponent()
}