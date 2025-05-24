package com.ujizin.poupeai.domain.model

import kotlinx.datetime.LocalDate

data class Expense(
    val id: Long = 0,
    val amount: Long,
    val category: Category,
    val isPaid: Boolean,
    val date: LocalDate,
    val description: String?,
    val isRecurring: Boolean,
    val repeatCount: Int?,
    val repeatIntervalDays: Int?,
)
