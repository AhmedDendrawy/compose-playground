package com.ahmed.firstproject

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LayoutCompose() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween

    ) {
        FirstComponent()
        SecondComponent()
        ThirdComponent()
    }


}

@Composable
fun FirstComponent(
    modifier: Modifier = Modifier
) {
    BasicText(
        "FirstComponent",
        modifier
            .background(Color.Red)
            .padding(8.dp)
    )
}

@Composable
fun SecondComponent(modifier: Modifier = Modifier) {
    BasicText(
        "SecondComponent",
        modifier
            .background(Color.Blue)
            .padding(8.dp)
    )
}

@Composable
fun ThirdComponent(modifier: Modifier = Modifier) {
    BasicText(
        "Third Component", modifier = modifier
            .background(Color.Cyan)
            .padding(8.dp)
    )

}

@Preview
@Composable
fun Layout() {
    LayoutCompose()
}