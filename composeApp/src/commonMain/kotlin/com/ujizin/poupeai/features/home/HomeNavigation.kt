package com.ujizin.poupeai.features.home

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.ujizin.poupeai.features.home.ui.HomeRoute
import com.ujizin.poupeai.navigation.routes.HomeRoute

fun NavGraphBuilder.homeNavigation() {
    navigation<HomeRoute.Nav>(startDestination = HomeRoute.Home) {
        composable<HomeRoute.Home> { HomeRoute() }
    }
}