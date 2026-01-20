package com.afriasdev.mycomposeapplication.components.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyCustomLayout(modifier: Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        Box(Modifier.fillMaxWidth().weight(1f).background(Color.Cyan), Alignment.Center) {
            Text("Ejemplo 1")
        }
        Spacer(Modifier.height(20.dp))
        Box(Modifier.fillMaxWidth().weight(1f)) {
            Row() {
                Box(Modifier.fillMaxHeight().weight(1f).background(Color.Red), Alignment.Center) {
                    Text("Ejemplo 2")
                }
                Spacer(Modifier.width(20.dp))
                Box(Modifier.fillMaxHeight().weight(1f).background(Color.Green), Alignment.Center) {
                    Text("Ejemplo 3")
                }
            }
        }
        Box(Modifier.fillMaxWidth().weight(1f).background(Color.Magenta), Alignment.BottomCenter) {
            Text("Ejemplo 4")
        }
    }
}