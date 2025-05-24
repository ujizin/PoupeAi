package com.ujizin.poupeai.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "category")
data class CategoryEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val title: String,
    val colorArgb: Long,
    val icon: String,
)
