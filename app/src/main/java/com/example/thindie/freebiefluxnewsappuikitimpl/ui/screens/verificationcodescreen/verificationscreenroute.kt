package com.example.thindie.freebiefluxnewsappuikitimpl.ui.screens.verificationcodescreen

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.thindie.freebiefluxnewsappuikitimpl.navigationdestinations.verificationCode

fun NavGraphBuilder.verificationsCodeScreen(
    onWrong: () -> Unit,
    onConfirm: () -> Unit,
    onRequestSendAgain: () -> Unit,
) {
    composable(verificationCode.route) {
        VerificationCodeScreen(
            onWrong, onConfirm, onRequestSendAgain
        )
    }
}