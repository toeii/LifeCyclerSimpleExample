package com.toeii.lifecycle

import android.app.Application
import androidx.lifecycle.ProcessLifecycleOwner

class App : Application(){

    private val appLifecycleListener by lazy { AppLifecycleListener() }

    override fun onCreate() {
        super.onCreate()

        //ProcessLifecycleOwner
        ProcessLifecycleOwner.get().lifecycle.addObserver(appLifecycleListener)

    }

}