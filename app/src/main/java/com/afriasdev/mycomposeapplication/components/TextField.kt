package com.afriasdev.mycomposeapplication.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp

@Composable
fun MyTexFieldParent(modifier: Modifier) {
    var user by remember { mutableStateOf("Andres") }
    var value by remember { mutableStateOf("") }

    Column(modifier = modifier) {
        MyTextField(user = user) { user = it }
        MySecondTextField(value = value) { value = it }
        MyAdvanceTextField(value = value) { value = it }
        MyPasswordTextField(value = value) { value = it }
        Spacer(Modifier.height(20.dp))
        MyOutlineTextField(value = value) { value = it }
    }
}

@Composable
fun MyTextField(user: String, onUserChange: (String) -> Unit) {
    TextField(user, onValueChange = { onUserChange(it) }, readOnly = user.isEmpty())
}

@Composable
fun MySecondTextField(value: String, onValueChange: (String) -> Unit) {
    TextField(value, onValueChange = { onValueChange(it) }, placeholder = {
        Text("Nombre")
    }, label = { Text("Introduce tu email") })
}

@Composable
fun MyAdvanceTextField(value: String, onValueChange: (String) -> Unit) {
    TextField(value, onValueChange = {
        if (it.contains("a")) {
            onValueChange(it.replace("a", ""))
        } else {
            onValueChange(it)
        }
    })
}

@Composable
fun MyPasswordTextField(value: String, onValueChange: (String) -> Unit) {
    var passwordHidden by remember { mutableStateOf(true) }

    TextField(
        value,
        onValueChange = { onValueChange(it) },
        singleLine = true,
        label = { Text("Introduce tu contraseña") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        visualTransformation = if (passwordHidden) PasswordVisualTransformation() else VisualTransformation.None,
        trailingIcon = {
            Text(
                text = if (passwordHidden) "Mostrar" else "Ccultar",
                modifier = Modifier.clickable { passwordHidden = !passwordHidden })
        }
    )
}

@Composable
fun MyOutlineTextField(value: String, onValueChange: (String) -> Unit) {
    OutlinedTextField(value, onValueChange = {onValueChange(it)})
}