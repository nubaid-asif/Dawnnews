package com.example.assignment2

import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ActivityViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    val imageView: ImageView = itemView.findViewById(R.id.articleImage)
    val titleTextView: TextView = itemView.findViewById(R.id.articleTitle)
    val detailsTextView: TextView = itemView.findViewById(R.id.articleDetails)
    val button: Button = itemView.findViewById(R.id.button)
}