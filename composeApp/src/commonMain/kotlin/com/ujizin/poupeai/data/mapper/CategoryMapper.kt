package com.ujizin.poupeai.data.mapper

import com.ujizin.poupeai.data.local.entities.CategoryEntity
import com.ujizin.poupeai.domain.model.Category
import com.ujizin.poupeai.domain.model.Icon

fun CategoryEntity.toDomain() = Category(
    id = id,
    title = title,
    colorArgb = colorArgb,
    icon = Icon.entries.find { it.name == icon } ?: Icon.UNKNOWN,
)

fun Category.toEntity() = CategoryEntity(
    id = id,
    title = title,
    colorArgb = colorArgb,
    icon = icon.name,
)
