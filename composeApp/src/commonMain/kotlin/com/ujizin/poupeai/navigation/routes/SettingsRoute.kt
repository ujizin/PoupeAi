package com.ujizin.poupeai.navigation.routes

import kotlinx.serialization.Serializable

sealed interface SettingsRoute: PoupeAiRoute {

    @Serializable
    data object Nav: SettingsRoute

    @Serializable
    data object Settings: SettingsRoute
}
