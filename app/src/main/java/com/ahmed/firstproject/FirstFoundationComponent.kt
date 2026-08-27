package com.ahmed.firstproject

import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.ahmed.firstproject.style.myStyle

@Composable
fun FirstFoundationComponent() {

    BasicText(
        text = "Ahmed",
        style = myStyle
    )

}

@Preview
@Composable
private fun FirstFoundationComponentPreview() {
    FirstFoundationComponent()
}