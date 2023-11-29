package com.example.appdua.view

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.appdua.R

class SsegarActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ssegar)

        val all: LinearLayout = findViewById(R.id.kt_satu)
        all.setOnClickListener(this)
        val paketmasak: LinearLayout = findViewById(R.id.kt_tiga)
        paketmasak.setOnClickListener(this)
        val sayurbumbu: LinearLayout = findViewById(R.id.kt_empat)
        sayurbumbu.setOnClickListener(this)
        val btnleft: ImageButton = findViewById(R.id.btn_img_left)
        btnleft.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.kt_satu -> {
                val intent = Intent(this@SsegarActivity, MainActivity::class.java)
                startActivity(intent)
                overridePendingTransition(0, 0)
            }

            R.id.kt_tiga -> {
                val intent = Intent(this@SsegarActivity, PmasakActivity::class.java)
                startActivity(intent)
                overridePendingTransition(0, 0)
            }

            R.id.kt_empat -> {
                val intent = Intent(this@SsegarActivity, SbumbuActivity::class.java)
                startActivity(intent)
                overridePendingTransition(0, 0)
            }

            R.id.btn_img_left -> {
                val intent = Intent(this@SsegarActivity, MainActivity::class.java)
                startActivity(intent)
                overridePendingTransition(0, 0)
            }
        }
    }
}