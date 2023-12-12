package com.example.appdua.view

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.appdua.R

class DetailAlamatActivity : AppCompatActivity() {

    private lateinit var alamatPengiriman: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_alamat)

        alamatPengiriman = findViewById(R.id.alamat_pengiriman)

        val bundle = intent.extras
        if(bundle != null){
            val nama = bundle.getString("nama")
            val namaJalan = bundle.getString("namaJalan")
            val rt = bundle.getString("rt")
            val rw = bundle.getString("rw")
            val info = bundle.getString("info")
            alamatPengiriman.text = "$nama,$namaJalan,Rt.$rt,/ Rw.$rw,$info"
        }
    }
}