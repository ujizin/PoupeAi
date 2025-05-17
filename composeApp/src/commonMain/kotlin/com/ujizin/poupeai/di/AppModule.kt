package com.ujizin.poupeai.di

import com.ujizin.poupeai.data.local.PoupeAiDatabase
import com.ujizin.poupeai.data.local.dao.ExpenseDao
import com.ujizin.poupeai.features.home.ui.HomeViewModel
import org.koin.core.module.Module
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

private val viewModelModule = module {
    viewModelOf(::HomeViewModel)
}

private val daoModule = module {
    single<ExpenseDao> { get<PoupeAiDatabase>().getExpenseDao() }
}

expect fun databaseModule(): Module

fun appModule() = listOf(
    viewModelModule,
    databaseModule(),
    daoModule
)
