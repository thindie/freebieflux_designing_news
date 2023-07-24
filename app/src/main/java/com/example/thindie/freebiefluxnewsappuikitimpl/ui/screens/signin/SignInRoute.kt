package com.example.thindie.freebiefluxnewsappuikitimpl.ui.screens.signin

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.thindie.freebiefluxnewsappuikitimpl.navigationdestinations.signIn

fun NavGraphBuilder.signInScreen(
    onSignIn: () -> Unit,
    onSpecialActionGoogle: () -> Unit,
    onSpecialActionMeta: () -> Unit,
    onClickForgotPassword: () -> Unit,
    onRequestSignUp: () -> Unit
) {
    composable(signIn.route) {
        SignInScreen(
            onClickSignIn = onSignIn,
            onClickSignInGoogle = onSpecialActionGoogle,
            onClickSignInFacebook = onSpecialActionMeta,
            onClickForgotPassword = onClickForgotPassword,
            onRequestSignUp = onRequestSignUp
        )

    }
}
