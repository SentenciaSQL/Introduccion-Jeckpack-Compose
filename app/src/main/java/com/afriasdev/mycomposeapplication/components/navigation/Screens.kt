package com.afriasdev.mycomposeapplication.components.navigation

import com.afriasdev.mycomposeapplication.components.navigation.examples.model.SettingModel
import kotlinx.serialization.Serializable

@Serializable
object Login

@Serializable
object Home

@Serializable
data class Detail(val id: String)

@Serializable
data class Settings(val settingsModel: SettingModel)