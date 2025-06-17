package com.ujizin.poupeai.themes

import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import com.ujizin.poupeai.themes.PoupeAiColor.grey100
import com.ujizin.poupeai.themes.PoupeAiColor.grey200
import com.ujizin.poupeai.themes.PoupeAiColor.grey800

object PoupeAiColor {
    val grey800 = Color(0xFF333446)
    val grey200 = Color(0xFFEAEFEF)
    val grey100 = Color(0xFFEAEFEF)
}

val lightColors = lightColorScheme(
    surfaceContainer = grey800,
    surface = grey800,
    onSurface = grey100,
    onSurfaceVariant = grey200,
    background = grey200,
    secondaryContainer = grey200,
    primaryContainer = grey800,
    onPrimaryContainer = grey100,
)
