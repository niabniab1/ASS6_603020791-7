package com.myweb.ass6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_two.view.*

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [TwoFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [TwoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TwoFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_two, container, false)
        view.btnClickFragTwo.setOnClickListener() {
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