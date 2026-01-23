package com.afriasdev.mycomposeapplication.components.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.afriasdev.mycomposeapplication.components.navigation.examples.DetailScreen
import com.afriasdev.mycomposeapplication.components.navigation.examples.HomeScreen
import com.afriasdev.mycomposeapplication.components.navigation.examples.LoginScreen
import com.afriasdev.mycomposeapplication.components.navigation.examples.SettingsScreen
import com.afriasdev.mycomposeapplication.components.navigation.examples.model.SettingModel
import com.afriasdev.mycomposeapplication.components.navigation.types.creativeNavType
import com.afriasdev.mycomposeapplication.components.navigation.types.settingsModelType
import kotlin.reflect.typeOf

@Composable
fun NavigationWrapper() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Login) {
        composable<Login> {
            LoginScreen(navigateToDetail = { navController.navigate(Home) })
        }

        composable<Home> {
            HomeScreen(navigateBack = { navController.popBackStack() }, navigateDetail = { id ->
                navController.navigate(
                    Detail(id = id)
                )
            })
        }

        composable<Detail> { navBarStackEntry ->
            val detail = navBarStackEntry.toRoute<Detail>()
            DetailScreen(id = detail.id, navigateToSettings = { navController.navigate(Settings(it)) })
        }

        composable<Settings>(typeMap = mapOf(typeOf<SettingModel>() to creativeNavType<SettingModel>())) { navBarStackEntry ->
            val setting = navBarStackEntry.toRoute<Settings>()
            SettingsScreen(settingModel = setting.settingsModel, navigateToHome = {
                navController.navigate(Login) {
                    popUpTo<Login> { inclusive = true }
                }
            })
        }
    }
}