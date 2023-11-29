package com.example.appdua.view

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.appdua.R

class LoginActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLogin: Button = findViewById(R.id.btn_login)
        btnLogin.setOnClickListener(this)
        val btnBuatAkun: TextView = findViewById(R.id.tv_buatAkun)
        btnBuatAkun.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_login -> {
                val loginIntent = Intent(this@LoginActivity, MainActivity::class.java)
                startActivity(loginIntent)
            }
            R.id.tv_buatAkun -> {
                val buatAkunIntent = Intent(this@LoginActivity, RegisterActivity::class.java)
                startActivity(buatAkunIntent)
            }
        }
    }
}