package com.ujizin.poupeai.themes

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

@Composable
fun PoupeAiNavigation(
    modifier: Modifier = Modifier,
) {
    val navController = rememberNavController()

    // TODO add routes
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = "",
    ) {

    }
}
