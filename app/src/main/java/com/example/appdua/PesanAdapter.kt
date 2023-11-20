package com.example.appdua

import android.icu.text.Transliterator.Position
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class PesanAdapter(private val pesanlist : ArrayList<Pesan>) : RecyclerView.Adapter<PesanAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_toko,parent,false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return pesanlist.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = pesanlist[position]
        holder.tvImage.setImageResource(currentItem.image)
        holder.tvHeading.text = currentItem.heading
        holder.tvDeskripsi.text = currentItem.deskripsi
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val tvImage : ShapeableImageView = itemView.findViewById(R.id.imageView3)
        val tvHeading : TextView = itemView.findViewById(R.id.textView3)
        val tvDeskripsi : TextView = itemView.findViewById(R.id.textView4)

    }


}