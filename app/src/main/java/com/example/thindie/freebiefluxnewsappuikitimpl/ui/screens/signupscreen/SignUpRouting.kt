package com.example.thindie.freebiefluxnewsappuikitimpl.ui.screens.signupscreen

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.thindie.freebiefluxnewsappuikitimpl.navigationdestinations.signUp

fun NavGraphBuilder.signUpScreen(onSignUp: () -> Unit, onSignIn: () -> Unit) {
    composable(signUp.route) {
        SignUpScreen(onSignUp = onSignUp, onSignIn = onSignIn)
    }
}