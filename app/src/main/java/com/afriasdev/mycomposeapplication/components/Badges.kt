package com.afriasdev.mycomposeapplication.components

import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.afriasdev.mycomposeapplication.R

@Composable
fun MyBadge(modifier: Modifier = Modifier) {
    Badge(containerColor = Color.Green, contentColor = Color.Blue) {
        Text("4")
    }
}

@Preview
@Composable
fun MyBadgeBox(modifier: Modifier = Modifier) {
    BadgedBox(modifier = modifier, badge = { MyBadge() }) {
        Icon(painter = painterResource(R.drawable.baseline_info_24), contentDescription = null)
    }
}