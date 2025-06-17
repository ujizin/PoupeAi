package com.ujizin.poupeai.themes

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import org.jetbrains.compose.resources.Font
import poupe_ai.composeapp.generated.resources.Manrope_Bold
import poupe_ai.composeapp.generated.resources.Manrope_ExtraBold
import poupe_ai.composeapp.generated.resources.Manrope_ExtraLight
import poupe_ai.composeapp.generated.resources.Manrope_Light
import poupe_ai.composeapp.generated.resources.Manrope_Medium
import poupe_ai.composeapp.generated.resources.Manrope_Regular
import poupe_ai.composeapp.generated.resources.Manrope_SemiBold
import poupe_ai.composeapp.generated.resources.Res

private val ManropeFontFamily: FontFamily
    @Composable get() = FontFamily(
        Font(Res.font.Manrope_ExtraLight, FontWeight.ExtraLight),
        Font(Res.font.Manrope_Light, FontWeight.Light),
        Font(Res.font.Manrope_Regular, FontWeight.Normal),
        Font(Res.font.Manrope_Medium, FontWeight.Medium),
        Font(Res.font.Manrope_SemiBold, FontWeight.SemiBold),
        Font(Res.font.Manrope_Bold, FontWeight.Bold),
        Font(Res.font.Manrope_ExtraBold, FontWeight.ExtraBold),
    )

val AppTypography: Typography
    @Composable get() = Typography().run {
        copy(
            displayLarge = displayLarge.copy(fontFamily = ManropeFontFamily),
            displayMedium = displayMedium.copy(fontFamily = ManropeFontFamily),
            displaySmall = displaySmall.copy(fontFamily = ManropeFontFamily),
            headlineLarge = headlineLarge.copy(fontFamily = ManropeFontFamily),
            headlineMedium = headlineMedium.copy(fontFamily = ManropeFontFamily),
            headlineSmall = headlineSmall.copy(fontFamily = ManropeFontFamily),
            titleLarge = titleLarge.copy(fontFamily = ManropeFontFamily),
            titleMedium = titleMedium.copy(fontFamily = ManropeFontFamily),
            titleSmall = titleSmall.copy(fontFamily = ManropeFontFamily),
            bodyLarge = bodyLarge.copy(fontFamily = ManropeFontFamily),
            bodyMedium = bodyMedium.copy(fontFamily = ManropeFontFamily),
            bodySmall = bodySmall.copy(fontFamily = ManropeFontFamily),
            labelLarge = labelLarge.copy(fontFamily = ManropeFontFamily),
            labelMedium = labelMedium.copy(fontFamily = ManropeFontFamily),
            labelSmall = labelSmall.copy(fontFamily = ManropeFontFamily),
        )
    }
