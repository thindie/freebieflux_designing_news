package com.example.thindie.freebiefluxnewsappuikitimpl.ui.screens.forgotpasswordscreen

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.thindie.freebiefluxnewsappuikitimpl.navigationdestinations.forgotPassword


fun NavGraphBuilder.forgetPasswordScreen(onClickTryAgain: () -> Unit, onClickNext: () -> Unit) {
    composable(forgotPassword.route) {
        ForgotPasswordScreen(onClickTryAgain = onClickTryAgain) {
            onClickNext()
        }
    }
}