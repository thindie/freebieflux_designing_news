package com.example.thindie.freebiefluxnewsappuikitimpl.ui.screens.signupscreen

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
fun SignUpScreen(onSignUp: () -> Unit, onSignIn: () -> Unit) {
    Page {

        AppSimpleHeader(
            header = R.string.header_welcome_nuntium,
            note = R.string.header_welcome_nuntium_body
        )

        AppInput(
            state = InputAbleState(
                leadingIcon = R.drawable.icon_user_24_24, hint = R.string.hint_username
            )
        ) {}

        AppInput(
            state = InputAbleState(
                leadingIcon = R.drawable.icon_envelope_24_24, hint = R.string.hint_email
            )
        ) {}

        AppInput(
            state = InputAbleState(
                leadingIcon = R.drawable.icon_lock_24_24, hint = R.string.hint_password
            )
        ) {}

        AppInput(
            state = InputAbleState(
                leadingIcon = R.drawable.icon_lock_24_24, hint = R.string.hint_repeat_signup_password
            )
        ) {}

        AppButton(label = R.string.button_sign_up) {
            onSignUp()
        }

        BottomHelpSection(
            question = R.string.question_already_accounted,
            action = R.string.action_sign_in
        ) {
            onSignIn()
        }
    }
}

@Preview
@Composable
fun previewForgotPassword() {
    FreebieFluxNewsAppUiKitImplTheme() {
        SignUpScreen(onSignUp = {}, onSignIn = {})
    }
}