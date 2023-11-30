package com.example.justtesting.data

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.justtesting.R

class ListDataHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val pictImg: ImageView = itemView.findViewById(R.id.picture_img)
    val tvName: TextView = itemView.findViewById(R.id.tv_name)
    val tvValDate: TextView = itemView.findViewById(R.id.tv_val_date)
}