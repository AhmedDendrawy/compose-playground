package com.ahmed.postCard

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ahmed.firstproject.R

@Composable
fun Avatar(
    image: Painter,
    modifier: Modifier = Modifier,
) {
    Image(
        painter = image,
        contentDescription = "profile image",
        modifier = modifier
            .size(48.dp)
            .clip(RoundedCornerShape(12.dp))
    )
}

@Preview
@Composable
private fun AvatarPreview(){
    Avatar(
        image = painterResource(R.drawable.profile_img)
    )
}