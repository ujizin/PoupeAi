package com.ujizin.poupeai.themes

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun PoupeAiTheme(
    content: @Composable () -> Unit,
) {
    MaterialTheme {
        content()
    }
}