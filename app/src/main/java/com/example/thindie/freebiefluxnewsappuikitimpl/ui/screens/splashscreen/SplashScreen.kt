package com.example.thindie.freebiefluxnewsappuikitimpl.ui.screens.splashscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.thindie.freebiefluxnewsappuikitimpl.R
import com.example.thindie.freebiefluxnewsappuikitimpl.navigationdestinations.splashScreen
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.theme.FreebieFluxNewsAppUiKitImplTheme
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.theme.purplePrimary
import kotlinx.coroutines.delay

private const val SplashWaitTime: Long = 2000
fun NavGraphBuilder.splashZcreen(onEnough: () -> Unit) {
    composable(splashScreen.route) {
        SplashScreen {
            onEnough()
        }
    }
}

@Composable
fun SplashScreen(onEnough: () -> Unit) {

    val currentTimeOut by rememberUpdatedState(newValue = onEnough)

    LaunchedEffect(true) {
        delay(3000)
        currentTimeOut()
    }

    Column(
        modifier = Modifier
            .background(color = purplePrimary)
            .fillMaxHeight()
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = R.drawable.application_logo), contentDescription = "")
    }
}

@Composable
@Preview
fun previewSplashScreen() {
    FreebieFluxNewsAppUiKitImplTheme {
        SplashScreen() {}
    }
}