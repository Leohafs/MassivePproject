package com.example.appdua.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.appdua.R

class PembayaranActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pembayaran)

        val btnBeli : Button = findViewById(R.id.btn_beli)
        btnBeli.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.btn_beli -> {
                val intent = Intent(this, SuccsesActivity::class.java)
                startActivity(intent)
            }
        }
    }
}