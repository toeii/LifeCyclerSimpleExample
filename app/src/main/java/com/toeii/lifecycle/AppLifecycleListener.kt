package com.toeii.lifecycle

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent


class AppLifecycleListener : LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public fun connectOnCreate(){
        System.out.println("connectOnCreate================")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public fun connectOnStart(){
        System.out.println("connectOnStart================")
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public fun connectOnResume(){
        System.out.println("connectOnResume================")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public fun connectOnPause(){
        System.out.println("connectOnPause================")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public fun connectOnStop(){
        System.out.println("connectOnStop================")
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public fun connectOnDestroy(){
        System.out.println("connectOnDestroy================")
    }


}