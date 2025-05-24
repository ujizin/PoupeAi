package com.ujizin.poupeai.domain.repository

import com.ujizin.poupeai.domain.model.Expense
import kotlinx.coroutines.flow.Flow

interface ExpenseRepository {
    fun getExpenses(): Flow<List<Expense>>
    suspend fun saveExpense(expense: Expense)
}