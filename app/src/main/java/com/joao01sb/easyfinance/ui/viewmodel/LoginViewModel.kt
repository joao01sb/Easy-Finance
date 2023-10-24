package com.joao01sb.easyfinance.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.joao01sb.easyfinance.ui.screen.login.LoginUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

class LoginViewModel(

) : ViewModel() {

    private val _uiState = MutableStateFlow(LoginUiState())
    val uiState: StateFlow<LoginUiState>
        get() = _uiState.asStateFlow()

    init {
        _uiState.update { state ->
            state.copy(
                onChangeUser = {
                    _uiState.value = _uiState.value.copy(
                        user = it
                    )
                },
                onChangePassword = {
                    _uiState.value = _uiState.value.copy(
                        passwrod = it
                    )
                },
            )
        }
    }

    private fun exibeErro() {
        _uiState.value = _uiState.value.copy(
            showError = true
        )
    }

    private fun logaUsuario() {
        _uiState.value = _uiState.value.copy(
            isLogado = true
        )
    }

}