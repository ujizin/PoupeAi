package com.ujizin.poupeai.common.ui.mapper

import com.ujizin.poupeai.common.ui.model.ExpenseUI
import com.ujizin.poupeai.domain.model.Expense

fun Expense.toUI() = ExpenseUI(
    id = id,
    amount = amount,
    category = category.toUI(),
    isPaid = isPaid,
    date = date,
    description = description,
    isRecurring = isRecurring,
    repeatCount = repeatCount,
    repeatIntervalDays = repeatIntervalDays,
)

fun ExpenseUI.toDomain() = Expense(
    id = id,
    amount = amount,
    category = category.toDomain(),
    isPaid = isPaid,
    date = date,
    description = description,
    isRecurring = isRecurring,
    repeatCount = repeatCount,
    repeatIntervalDays = repeatIntervalDays,
)