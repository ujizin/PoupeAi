package com.ujizin.poupeai.features.home.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ujizin.poupeai.common.mapItem
import com.ujizin.poupeai.common.ui.mapper.toUI
import com.ujizin.poupeai.domain.model.Expense
import com.ujizin.poupeai.domain.repository.ExpenseRepository
import com.ujizin.poupeai.features.home.state.HomeUiState
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import org.koin.android.annotation.KoinViewModel

@KoinViewModel
class HomeViewModel(
    expenseRepository: ExpenseRepository,
) : ViewModel() {

    val uiState = expenseRepository.getExpenses()
        .mapItem(Expense::toUI)
        .map { expenses ->
            HomeUiState(
                title = "Expenses",
                expenses = expenses,
            )
        }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), HomeUiState())
}
