package com.joao01sb.easyfinance.ui.screen.login

data class LoginUiState (
    val user: String = "",
    val passwrod: String = "",
    val showError: Boolean = false,
    val onChangeUser: (String) -> Unit = {},
    val onChangePassword: (String) -> Unit = {},
    val onClickStart: () -> Unit = {},
    val isLogado: Boolean = false
)