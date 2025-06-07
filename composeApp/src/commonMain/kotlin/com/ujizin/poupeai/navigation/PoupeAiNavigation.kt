package com.ujizin.poupeai.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.ujizin.poupeai.features.home.homeNavigation
import com.ujizin.poupeai.features.settings.settingsNavigation
import com.ujizin.poupeai.navigation.bottomnavigation.PoupeAiBottomNavigation
import com.ujizin.poupeai.navigation.routes.HomeRoute

@Composable
fun PoupeAiNavigation(
    modifier: Modifier = Modifier,
) {
    val navController = rememberNavController()

    PoupeAiBottomNavigation(
        modifier = modifier,
        navController = navController
    ) {
        NavHost(
            navController = navController,
            startDestination = HomeRoute.Nav,
        ) {
            homeNavigation()
            settingsNavigation()
        }
    }
}
