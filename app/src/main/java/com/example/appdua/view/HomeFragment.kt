package com.example.appdua.view

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import com.example.appdua.R

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

        val detailproduk : Button = view.findViewById(R.id.btn_detailpoduk)
        detailproduk.setOnClickListener {
            val intent = Intent(activity, DetailProdukActivity::class.java)
            startActivity(intent)
            activity?.overridePendingTransition(0, 0)
        }

        val notifikasi : ImageView = view.findViewById(R.id.img_notif)
        notifikasi.setOnClickListener {
            val intent = Intent(activity, NotifikasiActivity::class.java)
            startActivity(intent)
            activity?.overridePendingTransition(0, 0)
        }

        val keranjang : ImageView = view.findViewById(R.id.img_keranjang)
        keranjang.setOnClickListener {
            val intent = Intent(activity, KeranjangActivity::class.java)
            startActivity(intent)
            activity?.overridePendingTransition(0, 0)
        }

        return view
    }
}