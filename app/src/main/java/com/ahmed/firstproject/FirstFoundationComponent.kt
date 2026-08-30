package com.ahmed.firstproject

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.layout
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ahmed.firstproject.style.myStyle

@Composable
fun FirstFoundationComponent() {
    // var currentText: String by remember { mutableStateOf("Hello") }
    var scaleFloat: Float by remember { mutableFloatStateOf(1f) }


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
    Row(
        Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(8.dp)
    ) {
        FirstComponent(Modifier.background(Color.Blue))
        BasicText(
            text = "Click me",
            style = myStyle,
            modifier = Modifier
                .scale(scaleFloat)
                .clip(RoundedCornerShape(16.dp))
                .background(Color.White)
                .clickable {
                    scaleFloat += 0.2f
                }
                .border(
                    width = 1.dp, Color.Red,
                    shape = RoundedCornerShape(16.dp)
                )
                .padding(16.dp)
        )
        BasicText(
            text = "Click me 2",
            style = myStyle,
            modifier = Modifier
                .scale(scaleFloat)
                .clip(RoundedCornerShape(16.dp))
                .background(Color.White)
                .clickable {
                    scaleFloat += 0.2f
                }
                .border(
                    width = 1.dp, Color.Red,
                    shape = RoundedCornerShape(16.dp)
                )
                .padding(16.dp)
        )
        BasicText(
            text = "Click me 3",
            style = myStyle,
            modifier = Modifier
                .scale(scaleFloat)
                .clip(RoundedCornerShape(16.dp))
                .background(Color.White)
                .clickable {
                    scaleFloat += 0.2f
                }
                .border(
                    width = 1.dp, Color.Red,
                    shape = RoundedCornerShape(16.dp)
                )
                .padding(16.dp)
        )
    }
}

@Preview
@Composable
private fun FirstFoundationComponentPreview() {
    FirstFoundationComponent()
}