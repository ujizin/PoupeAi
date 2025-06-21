package com.ujizin.poupeai.features.settings.ui

import androidx.compose.runtime.Composable
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun SettingsRoute(
    viewModel: SettingsViewModel = koinViewModel()
) {

    SettingsScreen()
}

@Composable
fun SettingsScreen() {

}

@Preview
@Composable
private fun SettingsScreenPreview() {
    SettingsScreen()
}