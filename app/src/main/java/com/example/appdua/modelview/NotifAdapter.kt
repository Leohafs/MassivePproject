package com.example.appdua.modelview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.appdua.R
import com.example.appdua.model.notifikasi
import com.google.android.material.imageview.ShapeableImageView

class NotifAdapter(private val notifList : ArrayList<notifikasi>) :
    RecyclerView.Adapter<NotifAdapter.MyviewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_notifikasi,parent,false)

        return MyviewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return notifList.size
    }

    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {
        val currenItem = notifList[position]
        holder.image.setImageResource(currenItem.image)
        holder.namaToko.text = currenItem.namaToko
        holder.namaProduk.text = currenItem.namaProduk
        holder.varian.text = currenItem.varian
        holder.harga.text = currenItem.harga
        holder.jumlah.text = currenItem.jumlah



    }

    class MyviewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        val namaToko : TextView = itemView.findViewById(R.id.nama_toko)
        val image : ShapeableImageView = itemView.findViewById(R.id.img_produk)
        val namaProduk : TextView = itemView.findViewById(R.id.nama_produk)
        val varian : TextView = itemView.findViewById(R.id.varian)
        val harga : TextView = itemView.findViewById(R.id.harga)
        val jumlah : TextView = itemView.findViewById(R.id.jml_produk)
    }
}