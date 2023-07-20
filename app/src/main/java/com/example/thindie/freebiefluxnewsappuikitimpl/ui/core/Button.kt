package com.example.thindie.freebiefluxnewsappuikitimpl.ui.core

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.thindie.freebiefluxnewsappuikitimpl.R
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.theme.FreebieFluxNewsAppUiKitImplTheme
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.theme.lightGray
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.theme.purplePrimary
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.theme.white

@Composable
fun AppButton(@StringRes label: Int, onClick: () -> Unit) {
    Button(
        modifier = usualShape,
        colors = ButtonDefaults.buttonColors(containerColor = purplePrimary),
        shape = MaterialTheme.shapes.large,
        onClick = onClick
    ) {
        Text(text = stringResource(id = label), style = MaterialTheme.typography.bodyLarge)
    }
}

@Composable
fun AppOutlinedButton(
    @StringRes label: Int,
    @DrawableRes icon: Int,
    onClick: () -> Unit,
) {
    Button(
        modifier = usualShape,
        colors = ButtonDefaults.buttonColors(containerColor = white),
        shape = MaterialTheme.shapes.large,
        onClick = onClick,
        border = BorderStroke(Dp.Hairline, color = lightGray)
    ) {
        Icon(
            painter = painterResource(id = icon),
            contentDescription = "",
            modifier = Modifier.padding(start = 16.dp, top = 16.dp, bottom = 16.dp)
        )
        Text(
            text = stringResource(id = label),
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(start = 52.dp, top = 16.dp, bottom = 16.dp)
        )
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