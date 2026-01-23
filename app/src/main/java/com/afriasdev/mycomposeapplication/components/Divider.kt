package com.afriasdev.mycomposeapplication.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyDivider(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text("Parte de Arriba")
        HorizontalDivider(thickness = 3.dp, color = Color.Red)
        Text("Parte de Abajo")

        Row(modifier = Modifier.height(150.dp)) {
            Text("Izquierd")
            VerticalDivider(thickness = 3.dp, color = Color.Red)
            Text("Derecha")
        }
    }
}