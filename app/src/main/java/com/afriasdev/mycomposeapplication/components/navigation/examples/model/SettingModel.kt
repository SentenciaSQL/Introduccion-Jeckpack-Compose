package com.afriasdev.mycomposeapplication.components.navigation.examples.model

import android.os.Parcelable
import kotlinx.serialization.Serializable
import kotlinx.parcelize.Parcelize

@Serializable
@Parcelize
data class SettingModel(val id: String, val darkMode: Boolean): Parcelable