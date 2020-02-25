package jp.sadashi.apps.lifecycle.sample

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class LifecycleObserverSample(
    private val lifecycle: Lifecycle,
    private val tag: String
) : LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate() {
        println("$tag Lifecycle.Event.ON_CREATE")
        println("$tag ${lifecycle.currentState}")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStart() {
        println("$tag Lifecycle.Event.ON_START")
        println("$tag ${lifecycle.currentState}")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResume() {
        println("$tag Lifecycle.Event.ON_RESUME")
        println("$tag ${lifecycle.currentState}")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPause() {
        println("$tag Lifecycle.Event.ON_PAUSE")
        println("$tag ${lifecycle.currentState}")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStop() {
        println("$tag Lifecycle.Event.ON_STOP")
        println("$tag ${lifecycle.currentState}")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy() {
        println("$tag Lifecycle.Event.ON_DESTROY")
        println("$tag ${lifecycle.currentState}")
    }
}