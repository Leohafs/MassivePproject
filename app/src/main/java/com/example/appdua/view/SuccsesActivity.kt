package com.example.appdua.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.appdua.R

class SuccsesActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_succses)

        val btnBack : Button = findViewById(R.id.btn_backhome)
        btnBack.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_backhome -> {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}