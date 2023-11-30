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

class TwoActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

    val btnLewat: TextView = findViewById(R.id.Two_lewat)
    btnLewat.setOnClickListener(this)

    val btnLanjut: Button = findViewById(R.id.Two_lanjutkan)
    btnLanjut.setOnClickListener(this)
}

override fun onClick(v: View) {
    when(v.id){
        R.id.Two_lewat -> {
            val lewatIntent = Intent(this@TwoActivity, FourActivity::class.java)
            startActivity(lewatIntent)
        }
        R.id.Two_lanjutkan -> {
            val lanjutkanIntent = Intent(this@TwoActivity, ThreeActivity::class.java)
            startActivity(lanjutkanIntent)
        }
    }
}
}