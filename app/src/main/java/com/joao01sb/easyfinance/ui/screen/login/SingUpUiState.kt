package com.joao01sb.easyfinance.ui.screen.login

data class SingUpUiState(
    val name: String = "",
    val login: String = "",
    val password: String = "",
    val onChangeName: (String) -> Unit = {},
    val onChangeLogin: (String) -> Unit = {},
    val onChangePassword: (String) -> Unit = {},
    val onSave: () -> Unit = {}
)