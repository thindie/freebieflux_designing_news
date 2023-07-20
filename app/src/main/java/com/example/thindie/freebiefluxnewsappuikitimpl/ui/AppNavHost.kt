package com.example.thindie.freebiefluxnewsappuikitimpl.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import com.example.thindie.freebiefluxnewsappuikitimpl.navigationdestinations.onBoarding
import com.example.thindie.freebiefluxnewsappuikitimpl.navigationdestinations.welcome
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.screens.onboarding.onBoardingScreen
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.screens.signin.signInScreen
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.screens.splashscreen.splashZcreen
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.screens.welcomescreen.welcumeScreen

@Composable
fun AppNavHost(
    appState: AppState = rememberAppState(),
) {
    NavHost(navController = appState.navController, startDestination = appState.startDestination) {
        splashZcreen { appState.navigate(onBoarding.route) }
        onBoardingScreen { appState.navigate(welcome.route) }
        welcumeScreen { }
        signInScreen(
            onClickNext = {},
            onSpecialActionGoogle = {},
            onSpecialActionMeta = {},
            onClickForgotPassword = {})
    }
}