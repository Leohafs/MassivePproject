package com.example.appdua.view

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.appdua.R

class DetailAlamatActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var alamatPengiriman: TextView
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_alamat)

        alamatPengiriman = findViewById(R.id.alamat_pengiriman)


        val bundle = intent.extras
        if (bundle != null) {
            val nama = bundle.getString("nama")
            val namaJalan = bundle.getString("namaJalan")
            val rt = bundle.getString("rt")
            val rw = bundle.getString("rw")
            val info = bundle.getString("info")
            alamatPengiriman.text = "$nama,$namaJalan,Rt.$rt,/ Rw.$rw,$info"
        }

        val btnImgLeft: ImageButton = findViewById(R.id.btn_img_left)
        btnImgLeft.setOnClickListener(this)
        }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                R.id.btn_img_left -> {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}
