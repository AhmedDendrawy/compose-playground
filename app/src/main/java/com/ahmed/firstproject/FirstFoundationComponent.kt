package com.ahmed.firstproject

import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import com.ahmed.firstproject.style.myStyle

@Composable
fun FirstFoundationComponent() {
    var currentText: String by remember { mutableStateOf("Hello") }
    /*BasicText(
        text = "Ahmed",
        style = myStyle
    )*/

    BasicTextField(
        value = currentText,
        onValueChange = {
            currentText = it
        },
        textStyle = myStyle,
        //visualTransformation = PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Password,
            capitalization = KeyboardCapitalization.Words,
        ),
    )

}

@Preview
@Composable
private fun FirstFoundationComponentPreview() {
    FirstFoundationComponent()
}