package com.example.netflix_app.movies.continue_watching

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.netflix_app.R

class ContinueWatchingViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_continue_watching, parent, false)) {

    val image = itemView.findViewById<ImageView>(R.id.imgMovie)

    fun data(movie: ContinueWatching) {
        image.setImageResource(movie.image)
    }
}