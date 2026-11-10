package io.github.mcmorsh.nutritrack.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import io.github.mcmorsh.nutritrack.ui.add.AddScreen
import io.github.mcmorsh.nutritrack.ui.home.HomeScreen
import io.github.mcmorsh.nutritrack.ui.profile.ProfileScreen
import io.github.mcmorsh.nutritrack.ui.progress.ProgressScreen


@Composable
fun AppNavigation(navController: NavHostController, innerPadding: PaddingValues) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route,
        modifier = Modifier.padding(innerPadding)
    ) {
        composable(Screen.Home.route) {
            HomeScreen(
                onAddClick = {
                    navController.navigate(Screen.Add.route)
                },
                onProfileClick = {
                    navController.navigate(Screen.Profile.route)
                })
        }
        composable(Screen.Add.route) { AddScreen() }
        composable(Screen.Progress.route) { ProgressScreen() }
        composable(Screen.Profile.route) { ProfileScreen() }
    }
}
