package com.example.thindie.freebiefluxnewsappuikitimpl.ui.screens.verificationcodescreen

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.thindie.freebiefluxnewsappuikitimpl.R
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.core.AppButton
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.core.AppSimpleHeader
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.core.BottomHelpSection
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.core.Page
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.theme.FreebieFluxNewsAppUiKitImplTheme

@Composable
fun VerificationCodeScreen(
    onWrong: () -> Unit,
    onConfirm: () -> Unit,
    onRequestSendAgain: () -> Unit,
) {
    Page {
        AppSimpleHeader(
            header = R.string.header_verificationcode_title,
            note = R.string.header_verificationcode_body
        )
        ConfirmBlock(onWrong)
        AppButton(label = R.string.button_label_confirm) {
            onConfirm()
        }
        BottomHelpSection(
            question = R.string.question_dont_receive,
            action = R.string.action_send_again
        ) {
            onRequestSendAgain()
        }
    }

}

@Composable
private fun ConfirmBlock(onWrong: () -> Unit) {

}

@Composable
@Preview
fun previewVerifCodeScreen(){
    FreebieFluxNewsAppUiKitImplTheme() {
        VerificationCodeScreen(onWrong = { /*TODO*/ }, onConfirm = { /*TODO*/ }) {

        }
    }
}