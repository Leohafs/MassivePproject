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

class ThreeActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)

        val btnLewat: TextView = findViewById(R.id.Three_lewat)
        btnLewat.setOnClickListener(this)

        val btnLanjut: Button = findViewById(R.id.Three_lanjutkan)
        btnLanjut.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.Three_lewat -> {
                val lewatIntent = Intent(this@ThreeActivity,FourActivity::class.java)
                startActivity(lewatIntent)
            }
            R.id.Three_lanjutkan -> {
                val lanjutkanIntent = Intent(this@ThreeActivity, FourActivity::class.java)
                startActivity(lanjutkanIntent)
            }
        }
    }
}