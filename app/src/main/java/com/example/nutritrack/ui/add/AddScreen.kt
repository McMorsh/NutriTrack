package com.example.nutritrack.ui.add

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
fun AddScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "Добавить",
            style = MaterialTheme.typography.headlineLarge
        )

        Text(
            text = "Управляй своим планом приёма добавок",
            style = MaterialTheme.typography.bodyLarge
        )

        NutriCard {
            Text(
                text = "Добавки",
                style = MaterialTheme.typography.titleMedium
            )

            Text(
                text = "Здесь появится форма добавления добвки.",
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}