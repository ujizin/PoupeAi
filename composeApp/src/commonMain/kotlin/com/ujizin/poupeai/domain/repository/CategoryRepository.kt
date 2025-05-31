package com.ujizin.poupeai.domain.repository

import com.ujizin.poupeai.domain.model.Category
import kotlinx.coroutines.flow.Flow

interface CategoryRepository {
    fun getCategories(): Flow<List<Category>>
    suspend fun saveCategory(category: Category)
    suspend fun updateCategory(category: Category)
    suspend fun deleteCategory(id: Long)
}