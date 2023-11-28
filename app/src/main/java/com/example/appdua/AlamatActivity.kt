package com.example.appdua

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class AlamatActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alamat)

        val btnSimpan: Button = findViewById(R.id.btn_simpan)
        btnSimpan.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_simpan -> {
                val intent = Intent(this@AlamatActivity, DetailAlamatActivity::class.java)
                startActivity(intent)
            }
        }
    }
}