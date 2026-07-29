package com.example.nutritrack.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.nutritrack.ui.add.AddScreen
import com.example.nutritrack.ui.home.HomeScreen
import com.example.nutritrack.ui.profile.ProfileScreen
import com.example.nutritrack.ui.progress.ProgressScreen


@Composable
fun AppNavigation(navController: NavHostController, innerPadding: PaddingValues) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route,
        modifier = Modifier.padding(innerPadding)
    ) {
        composable(Screen.Home.route) { HomeScreen() }
        composable(Screen.Add.route) { AddScreen() }
        composable(Screen.Progress.route) { ProgressScreen() }
        composable(Screen.Profile.route) { ProfileScreen() }
    }
}
