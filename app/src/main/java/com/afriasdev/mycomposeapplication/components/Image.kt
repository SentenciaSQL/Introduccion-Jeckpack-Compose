package com.afriasdev.mycomposeapplication.components

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.afriasdev.mycomposeapplication.R

@Composable
fun MyImage(modifier: Modifier) {
    Image(
        painter = painterResource(R.drawable.github),
        contentDescription = "avatar image profile",
        modifier = Modifier
            .size(300.dp)
            .clip(RoundedCornerShape(50))
            .border(
                width = 5.dp,
                brush = Brush.linearGradient(colors = listOf(Color.Red, Color.Blue, Color.Yellow)),
                shape = RoundedCornerShape(50)
            ),
        contentScale = ContentScale.FillBounds
    )
}

@Composable
fun MyIcon(modifier: Modifier) {
    Box(modifier = modifier.fillMaxSize()) {
        Icon(
            painter = painterResource(R.drawable.ic_personita),
            contentDescription = null,
            modifier = Modifier.size(50.dp),
            tint = Color.Red
        )
    }


}

@Composable
fun MyNetWorkImage(modifier: Modifier) {
    AsyncImage(
        model = "https://avatars.githubusercontent.com/u/16361358",
        contentDescription = "Image from network",
        modifier = Modifier.size(500.dp),
        onError = {
            Log.i("Image", "Ha ocurrido un errir ${it.result.throwable.message}")
        }
    )
}