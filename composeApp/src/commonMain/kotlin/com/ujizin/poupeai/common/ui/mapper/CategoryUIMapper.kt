package com.ujizin.poupeai.common.ui.mapper

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import com.ujizin.poupeai.common.ui.model.CategoryUI
import com.ujizin.poupeai.domain.model.Category

fun Category.toUI() = CategoryUI(
    id = id,
    title = title,
    color = Color(colorArgb),
    icon = icon,
)

fun CategoryUI.toDomain() = Category(
    id = id,
    title = title,
    colorArgb = color.toArgb().toLong(),
    icon = icon,
)