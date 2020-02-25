package jp.sadashi.apps.lifecycle.sample

import androidx.activity.ComponentActivity
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class LifecycleObserverSample(private val activity: ComponentActivity) : LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate() {
        println("Lifecycle.Event.ON_CREATE")
        println(activity.lifecycle.currentState)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStart() {
        println("Lifecycle.Event.ON_START")
        println(activity.lifecycle.currentState)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResume() {
        println("Lifecycle.Event.ON_RESUME")
        println(activity.lifecycle.currentState)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPause() {
        println("Lifecycle.Event.ON_PAUSE")
        println(activity.lifecycle.currentState)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStop() {
        println("Lifecycle.Event.ON_STOP")
        println(activity.lifecycle.currentState)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy() {
        println("Lifecycle.Event.ON_DESTROY")
        println(activity.lifecycle.currentState)
    }
}