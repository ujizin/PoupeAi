package com.ujizin.poupeai.navigation.routes

import kotlinx.serialization.Serializable

sealed interface PoupeAiRoute {
    @Serializable
    sealed interface Home: PoupeAiRoute
}