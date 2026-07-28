package com.example.nutritrack.navigation

sealed class Screen(val route: String){
    data object Home: Screen("home")
    data object Add: Screen("add")
    data object Progress: Screen("progress")
    data object Profile: Screen("profile")
}