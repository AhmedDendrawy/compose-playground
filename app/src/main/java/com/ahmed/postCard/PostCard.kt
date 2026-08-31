package com.ahmed.postCard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.DragInteraction
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ahmed.firstproject.R


@Composable
fun PostCard(
    modifier: Modifier = Modifier,
    postImage: Painter,
    profileImage: Painter,
    publisherName: String,
    publishDate: String,
    content: String,
) {
    Column(
        modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(24.dp))
            .background(Color.White)
            .border(width = 1.dp, color = Color.Black.copy(alpha = 0.08f))
    ) {
        PostHeader(
            modifier = modifier.padding(12.dp),
            profileImage = profileImage,
            publisherName = publisherName,
            publishDate = publishDate
        )
        BasicText(
            text = content,
            modifier = Modifier
                .padding(horizontal = 12.dp)
                .padding(top = 4.dp)
                .padding(bottom = 12.dp),
            style = contentStyle
        )
        Image(
            painter = postImage,
            contentDescription = "Post image",
            modifier = Modifier.fillMaxWidth()
        )
    }
}


@Preview
@Composable
private fun PostCardPreview() {
    PostCard(
        postImage = painterResource(R.drawable.post_img),
        profileImage = painterResource(R.drawable.profile_img),
        publisherName = "Ahmed Dandrawy",
        publishDate = "8 July 1973,4:20 AM",
        content = " Jetpack Compose ❤️"
    )
}