package com.ujizin.poupeai.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.ujizin.poupeai.features.home.homeNavigation
import com.ujizin.poupeai.navigation.routes.HomeNavigation

@Composable
fun PoupeAiNavigation(
    modifier: Modifier = Modifier,
) {
    val navController = rememberNavController()

    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = HomeNavigation.Nav,
    ) {
        homeNavigation()
    }
}
