package com.ujizin.poupeai.data.repository

import com.ujizin.poupeai.common.mapItem
import com.ujizin.poupeai.data.local.dao.CategoryDao
import com.ujizin.poupeai.data.local.entities.CategoryEntity
import com.ujizin.poupeai.data.mapper.toDomain
import com.ujizin.poupeai.data.mapper.toEntity
import com.ujizin.poupeai.domain.model.Category
import com.ujizin.poupeai.domain.repository.CategoryRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.withContext

class CategoryRepositoryImpl(
    private val categoryDao: CategoryDao,
    private val dispatcher: CoroutineDispatcher,
) : CategoryRepository {

    override fun getCategories(): Flow<List<Category>> = categoryDao.getAll()
        .mapItem(CategoryEntity::toDomain)
        .flowOn(dispatcher)

    override suspend fun saveCategory(category: Category): Unit = withContext(dispatcher) {
        categoryDao.insert(category.toEntity())
    }
}
