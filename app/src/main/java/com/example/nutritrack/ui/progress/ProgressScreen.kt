package com.example.nutritrack.ui.progress

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
fun ProgressScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(text = "Прогресс", style = MaterialTheme.typography.headlineLarge)
        Text(text = "Отслеживай движение к своей цели", style = MaterialTheme.typography.bodyLarge)

        NutriCard() {
            Text(text = "Твой результат", style = MaterialTheme.typography.titleMedium)
            Text(
                text = "Здесь появится история веса и статистика.",
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}
