package com.example.thindie.freebiefluxnewsappuikitimpl.ui.core

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.thindie.freebiefluxnewsappuikitimpl.R
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.theme.FreebieFluxNewsAppUiKitImplTheme

@Composable
fun AppSimpleHeader(
    @StringRes header: Int,
    @StringRes note: Int,
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
    ) {
        Text(
            modifier = Modifier.padding(top = 28.dp),
            text = stringResource(id = header),
            style = MaterialTheme.typography.titleLarge
        )
        Text(
            modifier = Modifier.padding(top = 8.dp),
            text = stringResource(id = note),
            style = MaterialTheme.typography.bodySmall
        )
    }

}

@Composable
@Preview
fun previewHeader() {
    FreebieFluxNewsAppUiKitImplTheme() {
        Page {
            AppSimpleHeader(
                header = R.string.title_welcome_back, note = (R.string.body_welcome_back)
            )
        }

    }
}