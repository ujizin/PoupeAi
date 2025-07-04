package com.ujizin.poupeai.data.repository

import com.ujizin.poupeai.common.mapItem
import com.ujizin.poupeai.data.local.dao.CategoryDao
import com.ujizin.poupeai.data.local.dao.ExpenseDao
import com.ujizin.poupeai.data.mapper.toDomain
import com.ujizin.poupeai.data.mapper.toEntity
import com.ujizin.poupeai.domain.model.Expense
import com.ujizin.poupeai.domain.repository.ExpenseRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.withContext
import org.koin.core.annotation.Provided
import org.koin.core.annotation.Single

@Single
class ExpenseRepositoryImpl(
    @Provided private val expenseDao: ExpenseDao,
    @Provided private val categoryDao: CategoryDao,
    @Provided private val dispatcher: CoroutineDispatcher,
) : ExpenseRepository {

    override fun getExpenses(): Flow<List<Expense>> = expenseDao.getAll().mapItem { expense ->
        val category = categoryDao.findById(expense.id).toDomain()
        expense.toDomain(category)
    }.flowOn(dispatcher)

    override fun findExpense(id: Long): Flow<Expense> = expenseDao.get(id).map { expense ->
        val category = categoryDao.findById(expense.id).toDomain()
        expense.toDomain(category)
    }.flowOn(dispatcher)

    override suspend fun saveExpense(expense: Expense): Unit = withContext(dispatcher) {
        expenseDao.insert(expense.toEntity())
    }

    override suspend fun updateExpense(expense: Expense) = withContext(dispatcher) {
        expenseDao.update(expense.toEntity())
    }

    override suspend fun deleteExpense(id: Long) = withContext(dispatcher) {
        expenseDao.deleteById(id)
    }
}
