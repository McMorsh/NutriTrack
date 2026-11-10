package io.github.mcmorsh.nutritrack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import io.github.mcmorsh.nutritrack.ui.App
import io.github.mcmorsh.nutritrack.ui.theme.NutriTrackTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NutriTrackTheme {
                App()
            }
        }
    }
}
