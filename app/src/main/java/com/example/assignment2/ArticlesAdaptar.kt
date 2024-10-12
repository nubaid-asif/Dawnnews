package com.example.assignment2

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ArticlesAdaptar(val articles: List<Article>): RecyclerView.Adapter<ActivityViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ActivityViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_article, parent, false)
        return ActivityViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: ActivityViewHolder,
        position: Int
    ) {
        val article=articles.get(position)
        holder.imageView.setImageResource(article.imageResource)
        holder.titleTextView.text = article.title
        holder.detailsTextView.text = article.details
        holder.button.setOnClickListener {
            val intent = Intent(holder.itemView.context, ArticleDetailActivity::class.java)

            // Pass the article data, including fullDetails
            intent.putExtra("title", article.title)
            intent.putExtra("details", article.details)
            intent.putExtra("fullDetails", article.fullDetails) // Pass full details
            intent.putExtra("imageResource", article.imageResource)




            // Start the ArticleDetailsActivity
            holder.itemView.context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return articles.size
    }
}