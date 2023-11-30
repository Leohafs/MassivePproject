package com.example.appdua.Onbording

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.appdua.R
import com.example.appdua.view.MainActivity

class FourActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four)

        val btnStarted: Button = findViewById(R.id.Started)
        btnStarted.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.Started -> {
                val StartedIntent = Intent(this@FourActivity, MainActivity::class.java)
                startActivity(StartedIntent)
            }
        }
    }
}