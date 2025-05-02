package com.ujizin.poupeai.di

import com.ujizin.poupeai.features.home.ui.HomeViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

private val viewModelModule = module {
    viewModelOf(::HomeViewModel)
}

fun appModule() = listOf(
    viewModelModule
)
