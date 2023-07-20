package com.example.thindie.freebiefluxnewsappuikitimpl.ui.screens.onboarding

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.thindie.freebiefluxnewsappuikitimpl.navigationdestinations.onBoarding

fun NavGraphBuilder.onBoardingScreen(onNext: () -> Unit) {
    composable(route = onBoarding.route) {
        OnBoarding(onNext)
    }
}