package com.joao01sb.easyfinance.navigation

sealed class DestinationApp(val route: String) {
    object LoginGraph : DestinationApp("grafic_login")
    object Login : DestinationApp("login")
    object SingUp : DestinationApp("sing_up")
}