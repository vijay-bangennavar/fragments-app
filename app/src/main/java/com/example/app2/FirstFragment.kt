package com.example.app2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.first_fragment.view.*
import kotlinx.android.synthetic.main.second_fragment.view.*

class FirstFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val rootView =  inflater.inflate(R.layout.first_fragment, container, false)
        var buNext = rootView.findViewById<Button>(R.id.buNext)
        buNext.setOnClickListener{
            val secondFragment = SecondFragment()
            //val fragmentManager = activity!!.supportFragmentManager
            val fragmentTransaction = fragmentManager!!.beginTransaction()
            fragmentTransaction.replace(R.id.myFragment, secondFragment)
            fragmentTransaction.commit()
        }
        var inputText = arguments?.getString("input")
        rootView.tvNote.text= inputText

        return rootView
    }
}