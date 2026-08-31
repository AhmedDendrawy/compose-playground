package com.ahmed.postCard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ahmed.firstproject.R

@Composable
fun PostHeader(
    modifier: Modifier= Modifier,
    profileImage: Painter,
    publisherName: String,
    publishDate: String
){
    Row(modifier = modifier
        .fillMaxWidth()
        .padding(12.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Avatar(image = profileImage)
        Column() {
            BasicText(
                text = publisherName,
                style = titleStyle
            )
            BasicText(
                text = publishDate,
                style = subTitleStyle
            )
        }
    }
}
@Preview
@Composable
private fun PostHeaderPreview(){
    PostHeader(
        publisherName = "Ahmed Dandrawy",
        publishDate = "8 July 1973,4:20 AM",
        profileImage = painterResource(R.drawable.profile_img)
    )
}