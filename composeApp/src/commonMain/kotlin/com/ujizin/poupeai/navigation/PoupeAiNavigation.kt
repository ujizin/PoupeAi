package com.ujizin.poupeai.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ujizin.poupeai.features.home.HomeRoute
import com.ujizin.poupeai.navigation.routes.PoupeAiRoute

@Composable
fun PoupeAiNavigation(
    modifier: Modifier = Modifier,
) {
    val navController = rememberNavController()

    // TODO add routes
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = PoupeAiRoute.Home,
    ) {
        composable<PoupeAiRoute.Home> { HomeRoute() }
    }
}
