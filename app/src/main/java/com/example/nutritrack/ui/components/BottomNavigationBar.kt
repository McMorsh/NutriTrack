package com.example.nutritrack.ui.components

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.nutritrack.navigation.Screen


@Composable
fun BottomNavigationBar(navController: NavHostController) {
    val navBackStackEntry = navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry.value?.destination?.route

    val items = listOf(Screen.Home, Screen.Add, Screen.Progress, Screen.Profile)
    NavigationBar {
        items.forEach {
            screen -> NavigationBarItem(
                selected = currentRoute == screen.route,
                onClick = {
                    navController.navigate(screen.route){
                        popUpTo(navController.graph.startDestinationId){
                            saveState = true
                        }

                        launchSingleTop = true
                        restoreState = true
                    }
                },
                icon = {
                    Icon(
                        imageVector = screen.icon,
                        contentDescription = screen.title
                    )
                },
                label = {
                    Text(screen.title)
                }
            )
        }
    }
}