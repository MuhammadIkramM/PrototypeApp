package com.example.justtesting.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.justtesting.R
import com.example.justtesting.data.Dummy
import com.example.justtesting.data.ListDataHolder

class ListDummyAdapter(private val listDatDummy: ArrayList<Dummy>) : RecyclerView.Adapter<ListDataHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListDataHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.history_row, parent, false)
        return ListDataHolder(view)
    }

    override fun getItemCount(): Int = listDatDummy.size

    override fun onBindViewHolder(holder: ListDataHolder, position: Int) {
        val (name, valDate, images ) = listDatDummy[position]
        holder.pictImg.setImageResource(images)
        holder.tvName.text = name
        holder.tvValDate.text = valDate
    }
}


// ini untuk intent
//        holder.itemView.setOnClickListener {
//            val intentDetail = Intent(holder.itemView.context, Desc_Character::class.java)
//            intentDetail.putExtra("bebas",listChar[holder.adapterPosition])
//            holder.itemView.context.startActivity(intentDetail)
//        }