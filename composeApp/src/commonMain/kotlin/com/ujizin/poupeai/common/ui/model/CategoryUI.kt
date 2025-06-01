package com.ujizin.poupeai.common.ui.model

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import com.ujizin.poupeai.domain.model.Icon

@Immutable
data class CategoryUI(
    val id: Long = 0,
    val title: String,
    val color: Color,
    val icon: Icon,
)
