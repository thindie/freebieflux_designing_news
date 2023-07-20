package com.example.thindie.freebiefluxnewsappuikitimpl.ui.screens.onboarding

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.thindie.freebiefluxnewsappuikitimpl.R
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.core.AppButton
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.core.Page
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.theme.FreebieFluxNewsAppUiKitImplTheme

@Composable
fun OnBoarding(onNext: () -> Unit) {
    Page {
        OnBoardingHeaderWithSteps()
        Text(
            stringResource(R.string.onboarding_header),
            modifier = Modifier.padding(top = 34.dp),
            style = MaterialTheme.typography.titleLarge
        )
        Text(
            stringResource(R.string.onboarding_body),
            modifier = Modifier.padding(top = 24.dp),
            style = MaterialTheme.typography.bodySmall
        )
        AppButton(label = R.string.button_label_next) {
            onNext()
        }


    }
}

@Composable
fun OnBoardingHeaderWithSteps() {
    Column(
        modifier = Modifier.height(384.dp),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

    }
}

@Composable
@Preview
fun previewOnBoarding() {
    FreebieFluxNewsAppUiKitImplTheme {
        OnBoarding {

        }
    }
}
