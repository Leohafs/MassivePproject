package com.example.appdua.view

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.appdua.R

class AlamatActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var nama: EditText
    private lateinit var namaJalan: EditText
    private lateinit var rt: EditText
    private lateinit var rw: EditText
    private lateinit var info: EditText
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alamat)

        nama = findViewById(R.id.edt_nama)
        namaJalan = findViewById(R.id.edt_namajalan)
        rt = findViewById(R.id.edt_rt)
        rw = findViewById(R.id.edt_rw)
        info = findViewById(R.id.edt_infolainnya)

        val btnSimpan: Button = findViewById(R.id.btn_simpan)
        btnSimpan.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_simpan -> {

                val bundle = Bundle()
                bundle.putString("nama",nama.text.toString())
                bundle.putString("namaJalan",namaJalan.text.toString())
                bundle.putString("rt",rt.text.toString())
                bundle.putString("rw",rw.text.toString())
                bundle.putString("info",info.text.toString())

                val intent = Intent(this@AlamatActivity, DetailAlamatActivity::class.java)
                intent.putExtras(bundle)
                startActivity(intent)
            }
        }
    }
}