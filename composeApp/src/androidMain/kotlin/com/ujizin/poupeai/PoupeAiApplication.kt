package com.ujizin.poupeai

import android.app.Application
import com.ujizin.poupeai.di.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger

class PoupeAiApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidLogger()
            androidContext(this@PoupeAiApplication)
        }
    }
}