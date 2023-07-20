package com.example.thindie.freebiefluxnewsappuikitimpl.ui.screens.welcomescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.thindie.freebiefluxnewsappuikitimpl.R
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.core.AppButton
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.core.Page


@Composable
fun WelcomeScreen(onClickNext: () -> Unit) {

    Page {
        Image(painter = painterResource(id = R.drawable.ui_handshake), contentDescription = "")
        Image(
            painter = painterResource(id = R.drawable.application_text),
            contentDescription = "",
            modifier = Modifier.padding(top = 120.dp)
        )
        Text(
            text = stringResource(id = R.string.body_welcome_back),
            style = MaterialTheme.typography.bodySmall,
            modifier = Modifier.padding(top = 120.dp)
        )
        AppButton(label = R.string.button_label_get_started) {
            onClickNext()
        }
    }
}