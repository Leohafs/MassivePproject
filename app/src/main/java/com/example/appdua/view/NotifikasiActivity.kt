package com.example.appdua.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.appdua.R
import com.example.appdua.model.notifikasi
import com.example.appdua.modelview.NotifAdapter

class NotifikasiActivity : AppCompatActivity() {

    private lateinit var newRecyleView : RecyclerView
    private lateinit var newArrayList: ArrayList<notifikasi>
    lateinit var imageId : Array<Int>
    lateinit var nmToko : Array<String>
    lateinit var nmProduk : Array<String>
    lateinit var nmVarian : Array<String>
    lateinit var nmHarga : Array<String>
    lateinit var nmJumlah : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notifikasi)

        imageId = arrayOf(
            R.drawable.img_produk1,
            R.drawable.img_produk1,
        )
        nmToko = arrayOf(
            getString(R.string.nama_toko1),
            getString(R.string.nama_toko2),
        )
        nmProduk = arrayOf(
            "Bawang Merah",
            "Bawang Merah"
        )
        nmVarian = arrayOf(
            "Variant : 1 kg",
            "Variant : 100 gram",
        )
        nmHarga = arrayOf(
            "Rp.35.000",
            "Rp.3.500",
        )
        nmJumlah = arrayOf(
            "X1",
            "X2",
        )

        newRecyleView = findViewById(R.id.rv_notif)
        newRecyleView.layoutManager = LinearLayoutManager(this)
        newRecyleView.setHasFixedSize(true)

        newArrayList = arrayListOf<notifikasi>()
        getUserdata()


    }

    private fun getUserdata() {
        for(i in nmToko.indices){
            val notif = notifikasi(nmToko[i],imageId[i],nmProduk[i],nmVarian[i],nmHarga[i],nmJumlah[i])
            newArrayList.add(notif)
        }

        newRecyleView.adapter = NotifAdapter(newArrayList)
    }
}