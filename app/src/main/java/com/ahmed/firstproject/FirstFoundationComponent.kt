package com.ahmed.firstproject

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ahmed.firstproject.style.myStyle

@Composable
fun FirstFoundationComponent() {
   // var currentText: String by remember { mutableStateOf("Hello") }
    BasicText(
        text = "Ahmed",
        style = myStyle,
        modifier = Modifier
            .background(
                color = Color.Gray,
                shape = CircleShape

            ).width(120.dp)
            .height(60.dp)
            .padding(16.dp)
            //.clip(RoundedCornerShape(16.dp))
            .border(color = Color.Red, width = 1.dp)
    )

    /*BasicTextField(
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
    )*/

}

@Preview
@Composable
private fun FirstFoundationComponentPreview() {
    FirstFoundationComponent()
}