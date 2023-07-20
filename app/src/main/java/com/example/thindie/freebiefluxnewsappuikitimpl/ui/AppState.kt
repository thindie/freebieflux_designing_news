package com.example.thindie.freebiefluxnewsappuikitimpl.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.thindie.freebiefluxnewsappuikitimpl.navigationdestinations.splashScreen

@Composable
fun rememberAppState(controller: NavHostController = rememberNavController()): AppState {
    return remember(controller) {
        AppState(controller)
    }
}


@Stable
class AppState(val navController: NavHostController) {

    val startDestination
        @Composable get() = splashScreen.route

    fun navigate(route: String) {
        navController.navigate(route) {
            launchSingleTop = true
            restoreState = true
        }
    }


}