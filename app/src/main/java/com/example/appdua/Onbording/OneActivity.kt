package com.example.appdua.Onbording

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.appdua.R
import com.example.appdua.view.MainActivity
import com.example.appdua.view.RegisterActivity

class OneActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)

        val btnLewat: TextView = findViewById(R.id.One_lewat)
        btnLewat.setOnClickListener(this)
        val btnLanjut: Button = findViewById(R.id.One_lanjutkan)
        btnLanjut.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.One_lewat -> {
                val lewatIntent = Intent(this@OneActivity, FourActivity::class.java)
                startActivity(lewatIntent)
            }
            R.id.One_lanjutkan -> {
                val lanjutkanIntent = Intent(this@OneActivity, TwoActivity::class.java)
                startActivity(lanjutkanIntent)
            }
        }
    }
}