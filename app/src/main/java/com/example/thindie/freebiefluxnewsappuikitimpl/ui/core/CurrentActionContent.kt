package com.example.thindie.freebiefluxnewsappuikitimpl.ui.core

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


val usualShape: Modifier = Modifier
    .fillMaxWidth()
    .height(60.dp)

@Composable
fun Page(
    content: @Composable () -> Unit,
) {
    Column(
        modifier = Modifier
            .padding(start = 20.dp, end = 19.dp)
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        content()
    }
}