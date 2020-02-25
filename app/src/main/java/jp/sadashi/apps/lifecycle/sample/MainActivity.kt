package jp.sadashi.apps.lifecycle.sample

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val lifecycleObserver = LifecycleObserverSample(lifecycle, "Activity")

    override fun onCreate(savedInstanceState: Bundle?) {
        println("onCreate start")
        println("before : ${lifecycle.currentState}")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lifecycle.addObserver(lifecycleObserver)

        supportFragmentManager.beginTransaction()
            .replace(R.id.container, MainFragment())
            .commitNow()

        println("after : ${lifecycle.currentState}")
        println("onCreate end")
    }

    override fun onStart() {
        println("onStart start")
        println("before : ${lifecycle.currentState}")
        super.onStart()
        println("after : ${lifecycle.currentState}")
        println("onStart end")
    }

    override fun onResume() {
        println("onResume start")
        println("before : ${lifecycle.currentState}")
        super.onResume()
        println("after : ${lifecycle.currentState}")
        println("onResume end")
    }

    override fun onPause() {
        println("onPause start")
        println("before : ${lifecycle.currentState}")
        super.onPause()
        println("after : ${lifecycle.currentState}")
        println("onPause end")
    }

    override fun onStop() {
        println("onStop start")
        println("before : ${lifecycle.currentState}")
        super.onStop()
        println("after : ${lifecycle.currentState}")
        println("onStop end")
    }

    override fun onDestroy() {
        println("onDestroy start")
        println("before : ${lifecycle.currentState}")
        super.onDestroy()
        println("after : ${lifecycle.currentState}")
        println("onDestroy end")
    }

    override fun onRestart() {
        println("onRestart start")
        println("before : ${lifecycle.currentState}")
        super.onRestart()
        println("after : ${lifecycle.currentState}")
        println("onRestart end")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        println("onRestoreInstanceState start")
        println("before : ${lifecycle.currentState}")
        super.onRestoreInstanceState(savedInstanceState)
        println("after : ${lifecycle.currentState}")
        println("onRestoreInstanceState end")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        println("onSaveInstanceState start")
        println("before : ${lifecycle.currentState}")
        super.onSaveInstanceState(outState)
        println("after : ${lifecycle.currentState}")
        println("onSaveInstanceState end")
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        println("onPostCreate start")
        println("before : ${lifecycle.currentState}")
        super.onPostCreate(savedInstanceState)
        println("after : ${lifecycle.currentState}")
        println("onPostCreate end")
    }

    override fun onPostResume() {
        println("onPostResume start")
        println("before : ${lifecycle.currentState}")
        super.onPostResume()
        println("after : ${lifecycle.currentState}")
        println("onPostResume end")
    }
}
