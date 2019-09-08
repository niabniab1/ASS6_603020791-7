package com.myweb.ass6


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_three.view.*


/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [ThreeFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [ThreeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ThreeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_three, container, false)
        view.btnClickFragThree.setOnClickListener() {
            var fragment = OneFragment()
            replaceFragment(fragment)
        }
        return view
    }

    fun replaceFragment(someFragment: Fragment) {
        val transaction = fragmentManager!!.beginTransaction()
        transaction.replace(R.id.frameLayout, someFragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
