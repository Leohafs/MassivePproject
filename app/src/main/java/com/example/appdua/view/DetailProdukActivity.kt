package com.example.appdua.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.appdua.R

class DetailProdukActivity : AppCompatActivity(), View.OnClickListener {

    private var nol = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_produk)

        val btnBeli : Button = findViewById(R.id.btn_beli)
        btnBeli.setOnClickListener(this)

        val value : TextView = findViewById(R.id.value)
        val btnplus : Button = findViewById(R.id.plusbtn)
        val btnminus : Button = findViewById(R.id.minusbtn)

        value.text = "" + nol

        btnplus.setOnClickListener {
            value.text = "" + nol++
        }
        btnminus.setOnClickListener {
            value.text = "" + nol--
        }
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.btn_beli -> {
                val intent = Intent(this, PembayaranActivity::class.java)
                startActivity(intent)
            }
        }
    }
}