package com.example.thindie.freebiefluxnewsappuikitimpl.ui.core

import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import com.example.thindie.freebiefluxnewsappuikitimpl.ui.theme.commonShape

@Composable
fun AppSearch(state: InputAbleState) {
    OutlinedTextField(
        shape = commonShape,
        singleLine = true,
        value = state.currentLine.value,
        onValueChange = state::onTyping
    )
}


@Stable
class InputAbleState {
    private val _currentLine = mutableStateOf("")
    val currentLine: State<String>
        get() = _currentLine

    private val _isActive = mutableStateOf(false)
    val isActive: State<Boolean>
    get() = _isActive


    fun onTyping(text: String) {
        _currentLine.value = text
    }
}