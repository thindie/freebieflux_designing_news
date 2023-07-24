package com.example.thindie.freebiefluxnewsappuikitimpl.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import com.example.thindie.freebiefluxnewsappuikitimpl.navigationdestinations.forgotPassword
import com.example.thindie.freebiefluxnewsappuikitimpl.navigationdestinations.newPassword
import com.example.thindie.freebiefluxnewsappuikitimpl.navigationdestinations.onBoarding
import com.example.thindie.freebiefluxnewsappuikitimpl.navigationdestinations.signIn
import com.example.thindie.freebiefluxnewsappuikitimpl.navigationdestinations.signUp
import com.example.thindie.freebiefluxnewsappuikitimpl.navigationdestinations.verificationCode
import com.example.thindie.freebiefluxnewsappuikitimpl.navigationdestinations.welcome
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.screens.createnewpasswscreen.newPasswScreen
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.screens.forgotpasswordscreen.forgetPasswordScreen
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.screens.onboarding.onBoardingScreen
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.screens.signin.signInScreen
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.screens.signupscreen.signUpScreen
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.screens.splashscreen.splashZcreen
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.screens.verificationcodescreen.verificationsCodeScreen
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.screens.welcomescreen.welcumeScreen

@Composable
fun AppNavHost(
    appState: AppState = rememberAppState(),
) {
    NavHost(navController = appState.navController, startDestination = appState.startDestination) {

        splashZcreen { appState.navigate(onBoarding.route) }
        onBoardingScreen { appState.navigate(welcome.route) }
        welcumeScreen { appState.navigate(signIn.route) }
        signInScreen(
            onSignIn = {},
            onSpecialActionGoogle = {},
            onSpecialActionMeta = {},
            onRequestSignUp = { appState.navigate(signUp.route) },
            onClickForgotPassword = { appState.navigate(forgotPassword.route) })
        forgetPasswordScreen(onClickTryAgain = { appState.navigate(signIn.route) }, onClickNext = {
            appState.navigate(
                verificationCode.route
            )
        })
        verificationsCodeScreen(
            onWrong = {},
            onRequestSendAgain = {},
            onConfirm = { appState.navigate(newPassword.route) }
        )
        newPasswScreen(onConfirm = { appState.navigate(signIn.route) }, onSendAgain = {})
        signUpScreen(onSignUp = {}, onSignIn = {})
    }
}