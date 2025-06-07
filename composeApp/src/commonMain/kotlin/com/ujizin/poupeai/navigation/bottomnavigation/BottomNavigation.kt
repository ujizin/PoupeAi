package com.ujizin.poupeai.navigation.bottomnavigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import com.ujizin.poupeai.navigation.routes.HomeRoute
import com.ujizin.poupeai.navigation.routes.PoupeAiRoute
import com.ujizin.poupeai.navigation.routes.SettingsRoute
import org.jetbrains.compose.resources.StringResource
import poupe_ai.composeapp.generated.resources.Res
import poupe_ai.composeapp.generated.resources.home
import poupe_ai.composeapp.generated.resources.settings

enum class BottomNavigation(
    val titleRes: StringResource,
    val route: PoupeAiRoute,
    val icon: ImageVector,
) {
    Home(Res.string.home, HomeRoute.Nav, Icons.Default.Home),
    Add(Res.string.home, HomeRoute.Nav, Icons.Filled.Add),
    Settings(Res.string.settings, SettingsRoute.Nav, Icons.Default.Settings);

    companion object {
        val items: List<BottomNavigation> = listOf(Home, Settings)
        val center: BottomNavigation = Add
    }
}