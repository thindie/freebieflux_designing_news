package com.example.thindie.freebiefluxnewsappuikitimpl.ui.core

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.focus.FocusState
import androidx.compose.ui.focus.onFocusEvent
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.thindie.freebiefluxnewsappuikitimpl.R
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.theme.FreebieFluxNewsAppUiKitImplTheme
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.theme.backgroundGray
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.theme.black
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.theme.commonShape
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.theme.primaryGray
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.theme.purplePrimary
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.theme.white

@Composable
fun AppInput(state: InputAbleState, onClickTrailingIcon: () -> Unit) {
    OutlinedTextField(
        modifier = usualShape
            .onFocusEvent { focusState ->
                state.onFocusState(focusState)
            },
        shape = commonShape,
        singleLine = true,
        value = state.currentLine.value,
        onValueChange = state::onTyping,
        label = {
            if (!state.isActive.value) {
                Text(
                    text = stringResource(state.hint),
                    style = MaterialTheme.typography.bodyMedium
                )
            }

        },
        textStyle = MaterialTheme.typography.bodyMedium.copy(color = black),
        leadingIcon = {
            Icon(
                painter = painterResource(id = state.leadingIcon),
                contentDescription = ""
            )
        },
        trailingIcon = {
            if (state.trailingIcon != null)
                IconButton(
                    onClick = onClickTrailingIcon,
                )
                {
                    Icon(
                        painter = painterResource(
                            id = state.trailingIcon
                        ),
                        contentDescription = ""
                    )
                }

        },
        colors = state.textFieldColorsState
    )
}


@Stable
class InputAbleState(
    @DrawableRes val leadingIcon: Int,
    @DrawableRes val trailingIcon: Int? = null,
    @StringRes val hint: Int,
) {


    private val _currentLine = mutableStateOf("")
    val currentLine: State<String>
        get() = _currentLine

    private val _isActive = mutableStateOf(false)
    val isActive: State<Boolean>
        get() = _isActive


    fun onTyping(text: String) {
        _currentLine.value = text
    }

    fun onFocusState(focusState: FocusState) {
        if (_currentLine.value.isNotBlank()) {
            _isActive.value = true
        } else {
            _isActive.value = focusState.isFocused
        }
    }


    val textFieldColorsState
        @Composable get() = OutlinedTextFieldDefaults.colors(
            disabledTextColor = primaryGray,
            cursorColor = purplePrimary,
            errorCursorColor = MaterialTheme.colorScheme.onError,
            focusedLeadingIconColor = purplePrimary,
            unfocusedLeadingIconColor = primaryGray,
            disabledLeadingIconColor = primaryGray,
            errorLeadingIconColor = MaterialTheme.colorScheme.onError,
            focusedTextColor = black,
            unfocusedTextColor = primaryGray,
            errorTextColor = MaterialTheme.colorScheme.onError,
            focusedContainerColor = backgroundGray,
            unfocusedContainerColor = backgroundGray,
            disabledContainerColor = backgroundGray,
            errorContainerColor = MaterialTheme.colorScheme.onError,
            focusedTrailingIconColor = primaryGray,
            unfocusedTrailingIconColor = primaryGray,
            disabledTrailingIconColor = primaryGray,
            errorTrailingIconColor = MaterialTheme.colorScheme.onError,
            focusedLabelColor = primaryGray,
            unfocusedLabelColor = primaryGray,
            disabledLabelColor = primaryGray,
            errorLabelColor = MaterialTheme.colorScheme.onError,
            focusedPlaceholderColor = primaryGray,
            unfocusedPlaceholderColor = primaryGray,
            disabledPlaceholderColor = primaryGray,
            errorPlaceholderColor = primaryGray,
            focusedBorderColor = purplePrimary,
            unfocusedBorderColor = white,
            disabledBorderColor = white,
            errorBorderColor = white,
        )
}

@Preview
@Composable
fun previewSearch() {
    FreebieFluxNewsAppUiKitImplTheme() {
        AppInput(
            InputAbleState(
                leadingIcon = R.drawable.icon_search_24_24,
                trailingIcon = R.drawable.icon_microphone_24_24,
                hint = R.string.label_search
            )
        ) {}
    }
}

