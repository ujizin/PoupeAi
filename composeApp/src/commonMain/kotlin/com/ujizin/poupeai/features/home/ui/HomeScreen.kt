package com.ujizin.poupeai.features.home.ui

import androidx.compose.runtime.Composable
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun HomeRoute(
    viewmodel: HomeViewModel = koinViewModel(),
) {
    HomeScreen()
}

@Composable
fun HomeScreen() {

}

@Preview
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}