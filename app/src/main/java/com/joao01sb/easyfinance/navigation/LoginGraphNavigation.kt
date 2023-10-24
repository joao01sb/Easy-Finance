package com.joao01sb.easyfinance.navigation

import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.joao01sb.easyfinance.ui.screen.login.LoginScreen
import com.joao01sb.easyfinance.ui.screen.login.SingUpScreen
import com.joao01sb.easyfinance.ui.viewmodel.LoginViewModel
import com.joao01sb.easyfinance.ui.viewmodel.SingUpViewModel

fun NavGraphBuilder.loginGraph(
    onHomeNavigation: () -> Unit,
    onSingUpNavigation: () -> Unit,
    onSaveUser: () -> Unit
) {
    navigation(
        startDestination = DestinationApp.Login.route,
        route = DestinationApp.LoginGraph.route
    ) {
        composable(route = DestinationApp.Login.route) {
            val viewModelLogin =  viewModel<LoginViewModel>()//hiltViewModel<LoginViewModel>()
            val state by viewModelLogin.uiState.collectAsState()

            LoginScreen(
                state = state,
                onClickSingUp = onSingUpNavigation,
                onClickLogar = onHomeNavigation
            )
        }
        composable(route = DestinationApp.SingUp.route) {
            val viewModelSingUp = viewModel<SingUpViewModel>()//hiltViewModel<SingUpViewModel>()
            val state by viewModelSingUp.uiState.collectAsState()

            val scopeCoroutineContext = rememberCoroutineScope()

            SingUpScreen(
                state = state,
                onSave = {
                    onSaveUser()
                }
            )
        }
    }
}