package com.example.nutritrack.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.BarChart
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector


sealed class Screen(val route: String, val title: String, val icon: ImageVector){
    data object Home: Screen("home", "Главная", Icons.Default.Home)
    data object Add: Screen("add", "Добавить", Icons.Default.Add)
    data object Progress: Screen("progress", "Прогресс", Icons.Default.BarChart)
    data object Profile: Screen("profile", "Профиль", Icons.Default.Person)
}