package com.ujizin.poupeai.features.home.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.ujizin.poupeai.features.home.state.HomeUiState
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun HomeRoute(
    viewmodel: HomeViewModel = koinViewModel(),
) {
    val uiState by viewmodel.uiState.collectAsStateWithLifecycle()

    HomeScreen(
        uiState = uiState
    )
}

@Composable
fun HomeScreen(uiState: HomeUiState) {
    Column {
        Text(uiState.title)
        LazyColumn {
            items(
                items = uiState.expenses,
                key = { it.id },
            ) {
                Text(it.title)
            }
        }
    }
}

@Preview
@Composable
private fun HomeScreenPreview() {
    HomeScreen(
        uiState = HomeUiState()
    )
}