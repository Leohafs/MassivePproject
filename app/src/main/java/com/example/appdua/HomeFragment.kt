package com.example.appdua

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout

// TODO: Rename parameter arguments, choose names that match

class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val sayuranSegar : LinearLayout = view.findViewById(R.id.kt_dua)
        sayuranSegar.setOnClickListener {
            val intent = Intent(activity, SsegarActivity::class.java)
            startActivity(intent)
            activity?.overridePendingTransition(0, 0)
        }

        val paketmasak : LinearLayout = view.findViewById(R.id.kt_tiga)
        paketmasak.setOnClickListener {
            val intent = Intent(activity, PmasakActivity::class.java)
            startActivity(intent)
            activity?.overridePendingTransition(0, 0)
        }

        val sayurbumbu : LinearLayout = view.findViewById(R.id.kt_empat)
        sayurbumbu.setOnClickListener {
            val intent = Intent(activity, SbumbuActivity::class.java)
            startActivity(intent)
            activity?.overridePendingTransition(0, 0)
        }

        return view
    }
}