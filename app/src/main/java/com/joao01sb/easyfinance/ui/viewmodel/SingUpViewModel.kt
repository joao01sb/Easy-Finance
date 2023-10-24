package com.joao01sb.easyfinance.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.joao01sb.easyfinance.ui.screen.login.LoginUiState
import com.joao01sb.easyfinance.ui.screen.login.SingUpUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

class SingUpViewModel(

) : ViewModel() {

    private val _uiState = MutableStateFlow(SingUpUiState())
    val uiState: StateFlow<SingUpUiState>
        get() = _uiState.asStateFlow()

    init {
        _uiState.update { state ->
            state.copy(
                onChangeName = {
                    _uiState.value = _uiState.value.copy(
                        name = it
                    )
                },
                onChangeLogin = {
                    _uiState.value = _uiState.value.copy(
                        login = it
                    )
                },
                onChangePassword = {
                    _uiState.value = _uiState.value.copy(
                        password = it
                    )
                },
            )
        }
    }

    suspend fun save() {

    }


}