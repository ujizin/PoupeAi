package com.ujizin.poupeai

import androidx.compose.runtime.Composable
import com.ujizin.poupeai.navigation.PoupeAiNavigation
import com.ujizin.poupeai.themes.PoupeAiTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    PoupeAiTheme {
        PoupeAiNavigation()
    }
}