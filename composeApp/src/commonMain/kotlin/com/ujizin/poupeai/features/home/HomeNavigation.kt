package com.ujizin.poupeai.features.home

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.ujizin.poupeai.features.home.ui.HomeRoute
import com.ujizin.poupeai.navigation.routes.HomeNavigation

fun NavGraphBuilder.homeNavigation() {
    navigation<HomeNavigation.Nav>(startDestination = HomeNavigation.Home) {
        composable<HomeNavigation.Home> { HomeRoute() }
    }
}