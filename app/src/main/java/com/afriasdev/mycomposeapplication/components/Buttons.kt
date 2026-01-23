package com.afriasdev.mycomposeapplication.components

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.FloatingActionButtonElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.afriasdev.mycomposeapplication.R

@Composable
fun MyButtons(modifier: Modifier) {
    Column(modifier = modifier) {
        Button(
            onClick = { Log.i("Andres", "Boton Pulsado") },
            enabled = true,
            shape = RoundedCornerShape(20),
            border = BorderStroke(2.dp, Color.Red),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.Red,
                containerColor = Color.White,
                disabledContentColor = Color.Yellow
            )
        ) {
            Text("Pulsame")
        }

        OutlinedButton(
            onClick = {}, colors = ButtonDefaults.outlinedButtonColors(
                containerColor = Color.Blue
            )
        ) {
            Text("Outlined")
        }

        TextButton(onClick = {}) {
            Text("TextButton")
        }

        ElevatedButton(onClick = {}) {
            Text("ElevatedButton")
        }

        FilledTonalButton(onClick = {}) {
            Text("FilledTonalButton")
        }
    }
}

@Composable
fun MyFab(modifier: Modifier = Modifier, showCombat: () -> Unit) {
    FloatingActionButton(
        onClick = {showCombat()},
        shape = CircleShape,
        contentColor = Color.White,
        containerColor = Color.Blue,
        elevation = FloatingActionButtonDefaults.elevation(defaultElevation = 12.dp)
    ) {
        Icon(
            painter = painterResource(R.drawable.outline_add_24),
            contentDescription = null,
        )
    }
}