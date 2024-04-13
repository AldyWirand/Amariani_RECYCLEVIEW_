package com.example.uts_amariani

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MasakanAdapter(private val context: Context, private val masakan: List<Masakan>, val listener: (Masakan) -> Unit)
    : RecyclerView.Adapter<MasakanAdapter.MasakanViewHolder>() {

    class MasakanViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val imgmasakan = view.findViewById<ImageView>(R.id.img_item_photo)
        val namemasakan = view.findViewById<TextView>(R.id.tv_item_name)
        val desmasakan = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(masakan: Masakan, listener: (Masakan) -> Unit) {
            imgmasakan.setImageResource(masakan.imgmasakan)
            namemasakan.text = masakan.namemasakan
            desmasakan.text = masakan.desmasakan

        }

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MasakanViewHolder {
        return MasakanViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_masakan, parent, false)
        )

    }


    override fun onBindViewHolder(holder: MasakanViewHolder, position: Int) {
        holder.bindView(masakan[position], listener)
    }

    override fun getItemCount(): Int = masakan.size
    }