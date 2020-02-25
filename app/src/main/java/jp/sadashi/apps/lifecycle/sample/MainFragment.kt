package jp.sadashi.apps.lifecycle.sample

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class MainFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        println("Fragment onCreate start")
        super.onCreate(savedInstanceState)
        lifecycle.addObserver(LifecycleObserverSample(lifecycle, "Fragment"))
        println("Fragment onCreate end")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        println("Fragment onActivityCreated start")
        super.onActivityCreated(savedInstanceState)
        println("Fragment onActivityCreated end")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        println("Fragment onCreateView")
        return LayoutInflater.from(context)
            .inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        println("Fragment onViewCreated start")
        super.onViewCreated(view, savedInstanceState)
        viewLifecycleOwner.lifecycle.addObserver(LifecycleObserverSample(viewLifecycleOwner.lifecycle, "FragmentView"))
        println("Fragment onViewCreated end")
    }

    override fun onDestroyView() {
        println("Fragment onDestroyView start")
        super.onDestroyView()
        println("Fragment onDestroyView end")
    }

    override fun onDestroy() {
        println("Fragment onDestroy start")
        super.onDestroy()
        println("Fragment onDestroy end")
    }

    override fun onAttach(context: Context) {
        println("Fragment onAttach start")
        super.onAttach(context)
        println("Fragment onAttach end")
    }

    override fun onDetach() {
        println("Fragment onDetach start")
        super.onDetach()
        println("Fragment onDetach end")
    }

    override fun onPause() {
        println("Fragment onPause start")
        super.onPause()
        println("Fragment onPause end")
    }

    override fun onResume() {
        println("Fragment onResume start")
        super.onResume()
        println("Fragment onResume end")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        println("Fragment onSaveInstanceState start")
        super.onSaveInstanceState(outState)
        println("Fragment onSaveInstanceState end")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        println("Fragment onViewStateRestored start")
        super.onViewStateRestored(savedInstanceState)
        println("Fragment onViewStateRestored end")
    }

    override fun onStart() {
        println("Fragment onStart start")
        super.onStart()
        println("Fragment onStart end")
    }

    override fun onStop() {
        println("Fragment onStop start")
        super.onStop()
        println("Fragment onStop end")
    }
}