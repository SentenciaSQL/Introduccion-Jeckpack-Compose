package com.afriasdev.mycomposeapplication.components.navigation.examples

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.afriasdev.mycomposeapplication.components.navigation.examples.model.SettingModel

@Composable
fun SettingsScreen(settingModel: SettingModel, navigateToHome: () -> Unit) {
    Column(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(Modifier.weight(1f))
        Text("Setting: id: ${settingModel.id}, darkMode: ${settingModel.darkMode}", fontSize = 30.sp)
        Spacer(Modifier.weight(1f))
        Button(onClick = { navigateToHome() }) {
            Text("Volver al inicio")
        }
        Spacer(Modifier.weight(1f))
    }
}