package com.afriasdev.mycomposeapplication.state

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import kotlin.io.path.Path

@Composable
fun MyState(modifier: Modifier) {
    var number by rememberSaveable() { mutableIntStateOf(0) }

    Column(modifier.fillMaxSize()) {
        StateExample(number) { number += 1 }
        StateExample2(number = number, onClick = { number += 1 })
    }
}

@Composable
fun StateExample(number: Int, onClick:() -> Unit) {
    Text("Pulsame: $number", modifier = Modifier.clickable { onClick() })
}

@Composable
fun StateExample2(number: Int,  onClick:() -> Unit) {
    Text("Pulsame: $number", modifier = Modifier.clickable { onClick() })
}