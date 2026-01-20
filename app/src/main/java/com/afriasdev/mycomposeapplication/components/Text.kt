package com.afriasdev.mycomposeapplication.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp


@Composable
fun MyText(modifier: Modifier) {
    Column(modifier = modifier) {
        Text("Pepe")
        Text("Pepe Rojo", color = Color.Red)
        Text("Pepe", fontSize = 25.sp)
        Text("FontStyle", fontStyle = FontStyle.Italic)
        Text("FontWeight", fontWeight = FontWeight.ExtraBold, fontSize = 25.sp)
        Text("LetterSpacing", letterSpacing = 2.sp)
        Text(
            "TexrDecoration",
            textDecoration = TextDecoration.Underline,
            color = Color.Blue,
            modifier = Modifier.clickable {})
        Text(
            "TexrDecoration", textDecoration = TextDecoration.combine(
                listOf(
                    TextDecoration.Underline, TextDecoration.LineThrough
                )
            )
        )
        Text(
            "Align Align Align Align Align Align Align Align Align Align Align Align Align Align",
            modifier = Modifier.fillMaxWidth().background(Color.Red),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center
        )

    }

}