package com.example.thindie.freebiefluxnewsappuikitimpl.ui.screens.welcomescreen

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.thindie.freebiefluxnewsappuikitimpl.navigationdestinations.welcome

fun NavGraphBuilder.welcumeScreen(onClickNext: () -> Unit){
    composable(welcome.route){
        WelcomeScreen {
            onClickNext()
        }
    }
}
