package com.example.nutritrack.ui.profile

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.nutritrack.ui.components.NutriCard


@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(text = "Профиль", style = MaterialTheme.typography.headlineLarge)
        Text(text = "Настрой приложение под себя", style = MaterialTheme.typography.bodyLarge)

        NutriCard() {
            Text(text = "Личные данные", style = MaterialTheme.typography.titleMedium)
            Text(
                text = "Здесь появятся настройки профиля и цели.",
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}