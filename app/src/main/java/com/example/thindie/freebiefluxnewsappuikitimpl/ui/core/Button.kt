package com.example.thindie.freebiefluxnewsappuikitimpl.ui.core

import androidx.annotation.StringRes
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.thindie.freebiefluxnewsappuikitimpl.R
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.theme.FreebieFluxNewsAppUiKitImplTheme

@Composable
fun AppButton(@StringRes label: Int, onClick: () -> Unit) {
    Button(
        modifier = usualShape,
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF475AD7)),
        shape = MaterialTheme.shapes.large,
        onClick = onClick
    ) {
        Text(text = stringResource(id = label), style = MaterialTheme.typography.bodyLarge)
    }
}

@Preview
@Composable
fun previewButton() {
    FreebieFluxNewsAppUiKitImplTheme() {
        AppButton(label = R.string.button_label_next) {
        }
    }
}