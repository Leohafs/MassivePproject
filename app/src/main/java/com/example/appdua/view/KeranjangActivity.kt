package com.example.appdua.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.appdua.R

class KeranjangActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keranjang)

        val btnBeli : Button = findViewById(R.id.btn_beli)
        btnBeli.setOnClickListener(this)
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