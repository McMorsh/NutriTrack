package io.github.mcmorsh.nutritrack.ui

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import io.github.mcmorsh.nutritrack.navigation.AppNavigation
import io.github.mcmorsh.nutritrack.ui.components.BottomNavigationBar

@Composable
fun App() {
    val navController = rememberNavController()

    Scaffold(
        containerColor = MaterialTheme.colorScheme.background,

        bottomBar = {
            BottomNavigationBar(navController = navController)
        }
    ) { innerPadding ->
        AppNavigation(navController = navController, innerPadding = innerPadding)

    }
}