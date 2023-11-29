package com.example.appdua.view

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.appdua.R

class RegisterActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btnRegister : Button = findViewById(R.id.btn_register)
        btnRegister.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_register -> {
                val registerIntent = Intent(this@RegisterActivity, LoginActivity::class.java)
                startActivity(registerIntent)
            }
        }
    }
}