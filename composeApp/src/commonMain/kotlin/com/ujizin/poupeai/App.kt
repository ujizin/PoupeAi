package com.ujizin.poupeai

import androidx.compose.runtime.Composable
import com.ujizin.poupeai.navigation.PoupeAiNavigation
import com.ujizin.poupeai.themes.PoupeAiTheme
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.KoinContext

@Composable
@Preview
fun App() {
    KoinContext {
        PoupeAiTheme {
            PoupeAiNavigation()
        }
    }
}