package com.example.thindie.freebiefluxnewsappuikitimpl.ui.screens.signin

import androidx.compose.foundation.clickable
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.thindie.freebiefluxnewsappuikitimpl.R
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.core.AppButton
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.core.AppInput
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.core.AppOutlinedButton
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.core.AppSimpleHeader
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.core.InputAbleState
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.core.Page

@Suppress("LongParameterList")
@Composable
fun SignInScreen(
    onClickSignIn: () -> Unit,
    onClickSignInGoogle: () -> Unit,
    onClickSignInFacebook: () -> Unit,
    onClickForgotPassword: () -> Unit,
    email: InputAbleState = InputAbleState(
        leadingIcon = R.drawable.icon_envelope_24_24,
        trailingIcon = null,
        hint = R.string.hint_email
    ),
    password: InputAbleState = InputAbleState(
        leadingIcon = R.drawable.icon_lock_24_24,
        trailingIcon = null,
        hint = R.string.hint_password
    ),

    ) {

    Page {
        AppSimpleHeader(header = R.string.title_welcome_back, note = R.string.body_welcome_back)
        AppInput(email) {}
        AppInput(password) { }

        Text(
            text = stringResource(R.string.label_forgot_password),
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.clickable { onClickForgotPassword() })
        AppButton(label = R.string.button_sign_in) {
            onClickSignIn()
        }
        Text(
            text = stringResource(R.string.label_or_sign_in),
            style = MaterialTheme.typography.bodyMedium,
        )
        AppOutlinedButton(
            label = R.string.button_google_sign_in,
            icon = R.drawable.icon_google_24_24
        ) {
            onClickSignInGoogle()
        }

        AppOutlinedButton(
            label = R.string.button_facebook_sign_in,
            icon = R.drawable.icon_facebook_24_24
        ) {
            onClickSignInFacebook()
        }
    }
}