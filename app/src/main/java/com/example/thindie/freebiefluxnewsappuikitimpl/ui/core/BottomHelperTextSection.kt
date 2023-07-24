package com.example.thindie.freebiefluxnewsappuikitimpl.ui.core

import androidx.annotation.StringRes
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun BottomHelpSection(
    @StringRes question: Int,
    @StringRes action: Int,
    onClick: () -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 8.dp)
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Bottom
    ) {
        Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth()) {
            Text(text = stringResource(question), style = MaterialTheme.typography.titleSmall)
            Text(
                modifier = Modifier.clickable {
                    onClick()
                },
                text = stringResource(action),
                style = MaterialTheme.typography.titleSmall.copy(color = Color.Black)
            )
        }
    }
}