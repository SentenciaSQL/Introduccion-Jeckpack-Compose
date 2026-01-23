package com.afriasdev.mycomposeapplication.components

import androidx.compose.foundation.clickable
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.afriasdev.mycomposeapplication.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopAppBar(modifier: Modifier = Modifier, onNavSelected: ()-> Unit) {
    TopAppBar(
        title = { Text("My App") },
        navigationIcon = {
            Icon(
                painter = painterResource(R.drawable.baseline_menu_24),
                contentDescription = null,
                modifier = Modifier.clickable { onNavSelected() }
            )
        }, actions = {
            Icon(
                painter = painterResource(R.drawable.baseline_more_vert_24),
                contentDescription = null,
                tint = Color.White
            )
        }, colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Blue,
            titleContentColor = Color.White,
            navigationIconContentColor = Color.White,
            scrolledContainerColor = Color.Black
        ))
}