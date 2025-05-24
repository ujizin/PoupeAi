package com.ujizin.poupeai.data.mapper

import com.ujizin.poupeai.data.local.entities.ExpenseEntity
import com.ujizin.poupeai.domain.model.Category
import com.ujizin.poupeai.domain.model.Expense

fun ExpenseEntity.toDomain(category: Category): Expense = Expense(
    id = id,
    amount = amount,
    category = category,
    isPaid = isPaid,
    date = date,
    description = description,
    isRecurring = isRecurring,
    repeatCount = repeatCount,
    repeatIntervalDays = repeatIntervalDays,
)

fun Expense.toEntity() = ExpenseEntity(
    id = id,
    amount = amount,
    categoryId = category.id,
    isPaid = isPaid,
    date = date,
    description = description,
    isRecurring = isRecurring,
    repeatCount = repeatCount,
    repeatIntervalDays = repeatIntervalDays,
)