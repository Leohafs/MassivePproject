package com.example.appdua.view

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.appdua.R

class LapakFragment : Fragment() {
    // TODO: Rename and change types of parameters

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_lapak, container, false)

        val btnToko : Button = view.findViewById(R.id.btn_toko)
        btnToko.setOnClickListener {
            val intent = Intent(activity, DetailTokoActivity::class.java)
            startActivity(intent)
            activity?.overridePendingTransition(0, 0)
        }

        return view
    }

}