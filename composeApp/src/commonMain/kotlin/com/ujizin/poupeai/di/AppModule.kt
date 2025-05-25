package com.ujizin.poupeai.di

import com.ujizin.poupeai.data.local.PoupeAiDatabase
import com.ujizin.poupeai.data.local.dao.CategoryDao
import com.ujizin.poupeai.data.local.dao.ExpenseDao
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import org.koin.core.KoinApplication
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.dsl.module
import org.koin.ksp.generated.defaultModule

private val daoModule = module {
    single<ExpenseDao> { get<PoupeAiDatabase>().getExpenseDao() }
    single<CategoryDao> { get<PoupeAiDatabase>().getCategoryDao() }
    single<CoroutineDispatcher> { Dispatchers.IO }
}

expect fun databaseModule(): Module

private fun appModule() = listOf(
    databaseModule(),
    daoModule,
    defaultModule,
)

fun initKoin(block: KoinApplication.() -> Unit) = startKoin {
    modules(appModule())
    block()
}