package com.example.nutritrack.ui

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.nutritrack.navigation.AppNavigation
import com.example.nutritrack.ui.components.BottomNavigationBar

@Composable
fun App(){
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            BottomNavigationBar(navController = navController)
        }
    ) { innerPadding -> AppNavigation(navController = navController, innerPadding = innerPadding)

    }
}