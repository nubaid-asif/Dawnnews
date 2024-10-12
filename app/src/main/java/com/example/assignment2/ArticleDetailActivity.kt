package com.example.assignment2

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ArticleDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.article_details)

        // Get the data from Intent
        val title = intent.getStringExtra("title")
        val details = intent.getStringExtra("details")
        val fullDetails = intent.getStringExtra("fullDetails") // Get full details
        val imageResource = intent.getIntExtra("imageResource", 0)

        // Set the data to the views
        findViewById<TextView>(R.id.articleTitle).text = title
        findViewById<TextView>(R.id.articleDetails).text = details
        findViewById<TextView>(R.id.allDetails).text = fullDetails // Display full details
        findViewById<ImageView>(R.id.articleImage).setImageResource(imageResource)
    }
}
