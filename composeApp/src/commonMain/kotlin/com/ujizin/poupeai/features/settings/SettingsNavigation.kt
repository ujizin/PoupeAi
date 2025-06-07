package com.ujizin.poupeai.features.settings

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.ujizin.poupeai.features.settings.ui.SettingsRoute
import com.ujizin.poupeai.navigation.routes.SettingsRoute

fun NavGraphBuilder.settingsNavigation() {
    navigation<SettingsRoute.Nav>(startDestination = SettingsRoute.Settings) {
        composable<SettingsRoute.Settings> { SettingsRoute() }
    }
}