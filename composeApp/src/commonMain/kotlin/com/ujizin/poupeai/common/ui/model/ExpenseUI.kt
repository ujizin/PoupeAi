package com.ujizin.poupeai.common.ui.model

import androidx.compose.runtime.Immutable
import kotlinx.datetime.LocalDate

@Immutable
data class ExpenseUI(
    val id: Long = 0,
    val amount: Long,
    val category: CategoryUI,
    val isPaid: Boolean,
    val date: LocalDate,
    val description: String?,
    val isRecurring: Boolean,
    val repeatCount: Int?,
    val repeatIntervalDays: Int?,
)
