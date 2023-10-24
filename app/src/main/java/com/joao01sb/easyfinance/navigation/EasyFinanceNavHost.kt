package com.joao01sb.easyfinance.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost


@Composable
fun HelloAppNavHost(
    navController: NavHostController, modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = DestinationApp.LoginGraph.route,
        modifier = modifier
    ) {
        loginGraph(
            onHomeNavigation = {

            },
            onSingUpNavigation = {
                navController.navigateForSingUp()
            },
            onSaveUser = {
                navController.navigationLogin()
            }
        )
    }
}

fun NavHostController.navigateForSingUp() {
    navigate(DestinationApp.SingUp.route)
}

fun NavHostController.navigationLogin() {
    navigate(DestinationApp.Login.route) {
        popUpTo(0)
    }
}