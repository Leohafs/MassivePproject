package com.example.appdua

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.LinearLayout

class PmasakActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pmasak)

        val all: LinearLayout = findViewById(R.id.kt_satu)
        all.setOnClickListener(this)
        val sayuransegar: LinearLayout = findViewById(R.id.kt_dua)
        sayuransegar.setOnClickListener(this)
        val sayurbumbu: LinearLayout = findViewById(R.id.kt_empat)
        sayurbumbu.setOnClickListener(this)
        val btnleft: ImageButton = findViewById(R.id.btn_img_left)
        btnleft.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.kt_satu -> {
                val intent = Intent(this@PmasakActivity, MainActivity::class.java)
                startActivity(intent)
                overridePendingTransition(0, 0)
            }

            R.id.kt_dua -> {
                val intent = Intent(this@PmasakActivity, SsegarActivity::class.java)
                startActivity(intent)
                overridePendingTransition(0, 0)
            }

            R.id.kt_empat -> {
                val intent = Intent(this@PmasakActivity, SbumbuActivity::class.java)
                startActivity(intent)
                overridePendingTransition(0, 0)
            }

            R.id.btn_img_left -> {
                val intent = Intent(this@PmasakActivity, MainActivity::class.java)
                startActivity(intent)
                overridePendingTransition(0, 0)
            }
        }
    }
}
