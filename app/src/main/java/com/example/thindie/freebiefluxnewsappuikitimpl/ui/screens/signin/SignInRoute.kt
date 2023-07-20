package com.example.thindie.freebiefluxnewsappuikitimpl.ui.screens.signin

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.thindie.freebiefluxnewsappuikitimpl.navigationdestinations.signIn

fun NavGraphBuilder.signInScreen(
    onClickNext: () -> Unit,
    onSpecialActionGoogle: () -> Unit,
    onSpecialActionMeta: () -> Unit,
    onClickForgotPassword: () -> Unit,
) {
    composable(signIn.route) {
        SignInScreen(
            onClickSignIn = onClickNext,
            onClickSignInGoogle = onSpecialActionGoogle,
            onClickSignInFacebook = onSpecialActionMeta,
            onClickForgotPassword = onClickForgotPassword,
        )

    }
}
