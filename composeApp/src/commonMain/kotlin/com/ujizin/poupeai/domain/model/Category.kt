package com.ujizin.poupeai.domain.model

data class Category(
    val id: Long = 0,
    val title: String,
    val colorArgb: Long,
    val icon: Icon,
)
