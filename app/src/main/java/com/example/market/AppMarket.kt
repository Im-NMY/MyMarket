package com.example.market

import android.app.Application
import com.example.market.di.netWorkModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class AppMarket: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@AppMarket)
            modules(netWorkModule)
        }
    }
}