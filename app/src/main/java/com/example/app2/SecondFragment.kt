package com.example.app2

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.second_fragment.*
import kotlinx.android.synthetic.main.second_fragment.view.*


class SecondFragment : Fragment() {
    lateinit var comm : Communicator
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val rootView =  inflater.inflate(R.layout.second_fragment, container, false)
        comm = activity as Communicator
        var buBack = rootView.findViewById<Button>(R.id.buBack)
        buBack.setOnClickListener{
            val builder = AlertDialog.Builder(context)
            builder.setTitle("Leave Application?")
            builder.setCancelable(false)
            builder.setMessage("Are you sure you want to leave the application?")
            builder.setPositiveButton("YES"){dialog, which ->
                //Toast.makeText(getActivity(),"OK",Toast.LENGTH_SHORT).show()
                //var etNote = findViewById<EditText>(R.id.etNote)
                comm.passDataCom(etNote.text.toString())
            }
            builder.setNegativeButton("NO"){ dialog,which ->
                dialog.cancel()
            }
            val dialog: AlertDialog = builder.create()
            dialog.show()
        }
        return rootView
    }


}