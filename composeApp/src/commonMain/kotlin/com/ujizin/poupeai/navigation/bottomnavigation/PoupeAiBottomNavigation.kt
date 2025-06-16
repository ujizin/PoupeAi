package com.ujizin.poupeai.navigation.bottomnavigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hasRoute
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import org.jetbrains.compose.resources.stringResource

@Composable
fun PoupeAiBottomNavigation(
    modifier: Modifier,
    navController: NavController,
    content: @Composable BoxScope.() -> Unit,
) {
    Scaffold(
        modifier = modifier,
        bottomBar = {
            BottomAppBar(
                actions = {
                    val navBackStackEntry by navController.currentBackStackEntryAsState()
                    val currentDestination = navBackStackEntry?.destination
                    BottomNavigation.items.forEach { item ->
                        NavigationBarItem(
                            icon = { Icon(item.icon, contentDescription = item.name) },
                            label = { Text(stringResource(item.titleRes)) },
                            selected = currentDestination?.hierarchy?.any { it.hasRoute(item.route::class) } == true,
                            onClick = {
                                navController.navigate(item.route) {
                                    popUpTo(navController.graph.findStartDestination().id) {
                                        saveState = true
                                    }
                                    launchSingleTop = true
                                    restoreState = true
                                }
                            }
                        )
                    }
                }
            )
        },
        floatingActionButtonPosition = FabPosition.End,
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                content = {
                    Icon(BottomNavigation.center.icon, contentDescription = null)
                },
            )
        }
    ) { padding ->
        Box(
            modifier = Modifier.padding(padding),
            content = content,
        )
    }
}
