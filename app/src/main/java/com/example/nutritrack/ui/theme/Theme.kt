package com.example.nutritrack.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = NutriDarkPrimary,
    onPrimary = NutriDarkOnPrimary,
    primaryContainer = NutriDarkPrimaryContainer,
    onPrimaryContainer = NutriDarkOnPrimaryContainer,
    inversePrimary = NutriDarkInversePrimary,

    secondary = NutriDarkSecondary,
    onSecondary = NutriDarkOnSecondary,
    secondaryContainer = NutriDarkSecondaryContainer,
    onSecondaryContainer = NutriDarkOnSecondaryContainer,

    tertiary = NutriDarkTertiary,
    onTertiary = NutriDarkOnTertiary,
    tertiaryContainer = NutriDarkTertiaryContainer,
    onTertiaryContainer = NutriDarkOnTertiaryContainer,

    background = NutriDarkBackground,
    onBackground = NutriDarkOnBackground,
    surface = NutriDarkSurface,
    onSurface = NutriDarkOnSurface,
    surfaceVariant = NutriDarkSurfaceVariant,
    onSurfaceVariant = NutriDarkOnSurfaceVariant,
    surfaceDim = NutriDarkSurfaceDim,
    surfaceBright = NutriDarkSurfaceBright,
    surfaceContainerLowest = NutriDarkSurfaceContainerLowest,
    surfaceContainerLow = NutriDarkSurfaceContainerLow,
    surfaceContainer = NutriDarkSurfaceContainer,
    surfaceContainerHigh = NutriDarkSurfaceContainerHigh,
    surfaceContainerHighest = NutriDarkSurfaceContainerHighest,

    error = NutriDarkError,
    onError = NutriDarkOnError,
    errorContainer = NutriDarkErrorContainer,
    onErrorContainer = NutriDarkOnErrorContainer,

    outline = NutriDarkOutline,
    outlineVariant = NutriDarkOutlineVariant,

    inverseSurface = NutriDarkInverseSurface,
    inverseOnSurface = NutriDarkInverseOnSurface
)

private val LightColorScheme = lightColorScheme(
    primary = NutriPrimary,
    onPrimary = NutriOnPrimary,
    primaryContainer = NutriPrimaryContainer,
    onPrimaryContainer = NutriOnPrimaryContainer,
    inversePrimary = NutriInversePrimary,

    secondary = NutriSecondary,
    onSecondary = NutriOnSecondary,
    secondaryContainer = NutriSecondaryContainer,
    onSecondaryContainer = NutriOnSecondaryContainer,

    tertiary = NutriTertiary,
    onTertiary = NutriOnTertiary,
    tertiaryContainer = NutriTertiaryContainer,
    onTertiaryContainer = NutriOnTertiaryContainer,

    background = NutriBackground,
    onBackground = NutriOnBackground,
    surface = NutriSurface,
    onSurface = NutriOnSurface,
    surfaceVariant = NutriSurfaceVariant,
    onSurfaceVariant = NutriOnSurfaceVariant,
    surfaceDim = NutriSurfaceDim,
    surfaceBright = NutriSurfaceBright,
    surfaceContainerLowest = NutriSurfaceContainerLowest,
    surfaceContainerLow = NutriSurfaceContainerLow,
    surfaceContainer = NutriSurfaceContainer,
    surfaceContainerHigh = NutriSurfaceContainerHigh,
    surfaceContainerHighest = NutriSurfaceContainerHighest,

    error = NutriError,
    onError = NutriOnError,
    errorContainer = NutriErrorContainer,
    onErrorContainer = NutriOnErrorContainer,

    outline = NutriOutline,
    outlineVariant = NutriOutlineVariant,

    inverseSurface = NutriInverseSurface,
    inverseOnSurface = NutriInverseOnSurface
)

@Composable
fun NutriTrackTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
