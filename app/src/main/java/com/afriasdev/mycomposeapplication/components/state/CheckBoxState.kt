package com.afriasdev.mycomposeapplication.components.state

data class CheckBoxState(
    val id: String,
    val label: String,
    val checked: Boolean = false
)