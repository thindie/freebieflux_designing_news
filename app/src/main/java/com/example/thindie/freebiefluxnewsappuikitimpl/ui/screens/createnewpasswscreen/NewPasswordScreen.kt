package com.example.thindie.freebiefluxnewsappuikitimpl.ui.screens.createnewpasswscreen

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
fun NewPasswordScreen(onConfirm: () -> Unit, onSendAgain: () -> Unit) {
    Page {

        AppSimpleHeader(
            header = R.string.header_create_password,
            note = R.string.header_create_password_body
        )

        AppInput(
            state = InputAbleState(
                leadingIcon = R.drawable.icon_lock_24_24, hint = R.string.hint_password
            )
        ) {}

        AppInput(
            state = InputAbleState(
                leadingIcon = R.drawable.icon_lock_24_24, hint = R.string.hint_repeat_password
            )
        ) {}


        AppButton(label = R.string.button_sign_up) {
            onConfirm()
        }

        BottomHelpSection(
            question = R.string.question_dont_receive,
            action = R.string.action_send_again
        ) {
            onSendAgain()
        }
    }
}

@Preview
@Composable
fun previewNewPasswordScreen() {
    FreebieFluxNewsAppUiKitImplTheme() {
        NewPasswordScreen(onConfirm = {}, onSendAgain = {})
    }
}