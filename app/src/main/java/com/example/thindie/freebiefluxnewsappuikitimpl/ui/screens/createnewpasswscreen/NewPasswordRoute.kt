package com.example.thindie.freebiefluxnewsappuikitimpl.ui.screens.createnewpasswscreen

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.thindie.freebiefluxnewsappuikitimpl.navigationdestinations.newPassword

fun NavGraphBuilder.newPasswScreen(onConfirm: () -> Unit, onSendAgain: () -> Unit) {
    composable(newPassword.route) {
        NewPasswordScreen(onConfirm, onSendAgain)
    }
}