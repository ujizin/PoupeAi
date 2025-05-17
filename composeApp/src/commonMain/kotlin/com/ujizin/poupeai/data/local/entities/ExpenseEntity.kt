package com.ujizin.poupeai.data.local.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.datetime.LocalDate

@Entity(tableName = "expenses")
data class ExpenseEntity(
    @PrimaryKey(autoGenerate = true) val id: Long,
    @ColumnInfo(name = "amount") val amount: Long,
    @ColumnInfo(name = "category_id") val categoryId: String,
    @ColumnInfo(name = "is_paid") val isPaid: Boolean = false,
    @ColumnInfo(name = "date") val date: LocalDate,
    @ColumnInfo(name = "description") val description: String? = null,
    @ColumnInfo(name = "is_recurring") val isRecurring: Boolean = false,
    @ColumnInfo(name = "repeat_count") val repeatCount: Int? = null,
    @ColumnInfo(name = "repeat_interval_days") val repeatIntervalDays: Int? = null
)