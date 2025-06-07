package com.ujizin.poupeai.navigation.routes

import kotlinx.serialization.Serializable

sealed interface HomeRoute : PoupeAiRoute {

    @Serializable
    data object Nav : HomeRoute

    @Serializable
    data object Home : HomeRoute
}
