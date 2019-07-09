package com.toeii.lifecycle

import android.app.Application
import androidx.lifecycle.ProcessLifecycleOwner

class App : Application(){

    private val sampleLifecycleListener by lazy { AppLifecycleListener() }

    override fun onCreate() {
        super.onCreate()

        ProcessLifecycleOwner.get().lifecycle.addObserver(sampleLifecycleListener)

    }

}