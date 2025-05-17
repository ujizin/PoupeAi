package com.ujizin.poupeai.di

import com.ujizin.poupeai.data.local.PoupeAiDatabase
import com.ujizin.poupeai.data.local.getDatabaseBuilder
import org.koin.android.ext.koin.androidContext
import org.koin.core.module.Module
import org.koin.dsl.module

actual fun databaseModule(): Module = module {
    single<PoupeAiDatabase> { getDatabaseBuilder(androidContext()).build() }
}