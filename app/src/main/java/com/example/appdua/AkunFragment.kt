package com.example.appdua

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class AkunFragment : Fragment() {
    // TODO: Rename and change types of parameters

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_akun, container, false)

        // Mendapatkan referensi ke tombol dari layout
        val loginButton: Button = view.findViewById(R.id.btn_logout)

        // Menambahkan onClickListener ke tombol
        loginButton.setOnClickListener {
            // Memulai aktivitas login di sini
            // Gantilah LoginActivity::class.java dengan kelas aktivitas login yang sebenarnya
            val intent = Intent(activity, LoginActivity::class.java)
            startActivity(intent)

            activity?.overridePendingTransition(0, 0)
        }

        val tvAlamat: TextView = view.findViewById(R.id.tv_alamat)
        tvAlamat.setOnClickListener {
            val intent = Intent(activity, AlamatActivity::class.java)
            startActivity(intent)
            activity?.overridePendingTransition(0, 0)

        }
        return view

    }
}