@file:OptIn(ExperimentalMaterial3Api::class)

package com.afriasdev.mycomposeapplication.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MenuAnchorType
import androidx.compose.material3.MenuDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.PopupProperties
import com.afriasdev.mycomposeapplication.R

@Composable
fun MyExposeDropDownMenu(modifier: Modifier = Modifier) {
    var expanded by remember { mutableStateOf(false) }
    var selection by remember { mutableStateOf("") }

    ExposedDropdownMenuBox(modifier = modifier, expanded = expanded, onExpandedChange = { expanded = !expanded }) {
        TextField(
            value = selection,
            onValueChange = {},
            readOnly = true,
            label = { Text("Idioma") },
            modifier = Modifier.menuAnchor(MenuAnchorType.PrimaryNotEditable, enabled = true).fillMaxWidth(),
            trailingIcon = {
                ExposedDropdownMenuDefaults.TrailingIcon(expanded)
            }
        )
        DropdownMenu(modifier = modifier.fillMaxWidth(), expanded = expanded, onDismissRequest = { expanded = false }) {
            DropdownMenuItem(text = { Text("Opcion 1") }, onClick = {
                selection = "Opcion 1"
                expanded = false
            })
            DropdownMenuItem(text = { Text("Opcion 2") }, onClick = {
                selection = "Opcion 2"
                expanded = false
            })
            DropdownMenuItem(text = { Text("Opcion 3") }, onClick = {
                selection = "Opcion 3"
                expanded = false
            })
            DropdownMenuItem(text = { Text("Opcion 4") }, onClick = {
                selection = "Opcion 4"
                expanded = false
            })
            DropdownMenuItem(text = { Text("Opcion 5") }, onClick = {
                selection = "Opcion 5"
                expanded = false
            })
        }
    }
}

@Composable
fun MyDropDownMenu(modifier: Modifier = Modifier) {
    var expanded by remember { mutableStateOf(false) }

    Box(modifier = modifier) {
        Button(onClick = { expanded = true }) {
            Text("Ver opciones")
        }
        DropdownMenu(
            expanded,
            onDismissRequest = { expanded = false },
            offset = DpOffset(16.dp, 16.dp),
            properties = PopupProperties(
                focusable = true,
                dismissOnClickOutside = false,
                dismissOnBackPress = false,
                clippingEnabled = false
            )
        ) {
            DropdownMenuItem(text = { Text("Opcion 1") }, onClick = { expanded = false })
            DropdownMenuItem(text = { Text("Opcion 2") }, onClick = { expanded = false })
            DropdownMenuItem(text = { Text("Opcion 3") }, onClick = { expanded = false })
            DropdownMenuItem(text = { Text("Opcion 4") }, onClick = { expanded = false })
            DropdownMenuItem(text = { Text("Opcion 5") }, onClick = { expanded = false })
        }
    }
}

@Composable
fun MyDropDownItem(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        DropdownMenuItem(
            modifier = Modifier.fillMaxWidth(),
            text = {
                Text("Ejemplo 1")
            },
            leadingIcon = {
                Icon(
                    painter = painterResource(R.drawable.outline_add_task_24),
                    contentDescription = null
                )
            },
            trailingIcon = {
                Icon(
                    painter = painterResource(R.drawable.ic_personita),
                    contentDescription = null
                )
            },
            enabled = true,
            contentPadding = PaddingValues(16.dp),
            colors = MenuDefaults.itemColors(
                textColor = Color.Red,
                leadingIconColor = Color.Blue,
                trailingIconColor = Color.Green,
                disabledTextColor = Color.Red,
                disabledLeadingIconColor = Color.Blue,
                disabledTrailingIconColor = Color.Green
            ),
            onClick = {})
    }
}