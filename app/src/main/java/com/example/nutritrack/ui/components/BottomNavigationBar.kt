package com.example.nutritrack.ui.components

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.nutritrack.navigation.Screen


@Composable
fun BottomNavigationBar(navController: NavHostController) {
    val items = listOf(Screen.Home, Screen.Add, Screen.Progress, Screen.Profile)
    items.forEach {

    }
}