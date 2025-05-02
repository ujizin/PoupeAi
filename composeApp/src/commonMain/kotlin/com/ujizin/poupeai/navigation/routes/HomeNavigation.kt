package com.ujizin.poupeai.navigation.routes

import kotlinx.serialization.Serializable

sealed interface HomeNavigation : PoupeAiRoute {

    @Serializable
    data object Nav : HomeNavigation

    @Serializable
    data object Home : HomeNavigation
}
