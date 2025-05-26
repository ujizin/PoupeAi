package com.ujizin.poupeai.features.home.ui

import androidx.lifecycle.ViewModel
import com.ujizin.poupeai.domain.repository.CategoryRepository
import com.ujizin.poupeai.domain.repository.ExpenseRepository
import org.koin.android.annotation.KoinViewModel

@KoinViewModel
class HomeViewModel(
    private val expenseRepository: ExpenseRepository,
    private val categoryRepository: CategoryRepository,
) : ViewModel() {

}
