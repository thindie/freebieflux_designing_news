package com.example.thindie.freebiefluxnewsappuikitimpl.ui.screens.forgotpasswordscreen

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.thindie.freebiefluxnewsappuikitimpl.R
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.core.AppButton
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.core.AppInput
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.core.AppSimpleHeader
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.core.BottomHelpSection
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.core.InputAbleState
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.core.Page
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.theme.FreebieFluxNewsAppUiKitImplTheme

@Composable
fun ForgotPasswordScreen(onClickTryAgain: () -> Unit, onClickNext: () -> Unit) {
    Page {
        AppSimpleHeader(
            header = R.string.header_forgot_password,
            note = R.string.header_forgotpassword_body
        )
        AppInput(
            state = InputAbleState(
                leadingIcon = R.drawable.icon_envelope_24_24,
                hint = R.string.hint_email
            )
        ) {

        }

        AppButton(label = R.string.button_label_next) {
            onClickNext()
        }
        BottomHelpSection(
            question = R.string.question_remember_password,
            action = R.string.action_try_again
        ) {
            onClickTryAgain()
        }

    }
}

@Preview
@Composable
fun previewForgotPassword() {
    FreebieFluxNewsAppUiKitImplTheme() {
        ForgotPasswordScreen(onClickTryAgain = {}) {

        }
    }
}