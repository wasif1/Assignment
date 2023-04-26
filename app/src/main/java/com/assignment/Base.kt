package com.assignment

import android.app.Application
import android.support.multidex.MultiDex
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class Base : Application() {
    override fun onCreate() {
        super.onCreate()
        MultiDex.install(this)
    }
}