package com.ujizin.poupeai

import android.app.Application
import com.ujizin.poupeai.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class PoupeAiApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        // TODO refactor to common later
        startKoin {
            androidLogger()
            androidContext(this@PoupeAiApplication)
            modules(appModule())
        }
    }
}