package com.ujizin.poupeai.features.home.state

import androidx.compose.runtime.Immutable
import com.ujizin.poupeai.common.ui.model.ExpenseUI

@Immutable
data class HomeUiState(
    val title: String = "",
    val expenses: List<ExpenseUI> = emptyList(),
)
