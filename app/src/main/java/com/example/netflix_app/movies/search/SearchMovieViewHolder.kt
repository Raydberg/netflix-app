package com.example.netflix_app.movies.search

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.netflix_app.R

class SearchMovieViewHolder(inflate: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflate.inflate(R.layout.item_search_movie, parent, false)) {

    val imageMovie = itemView.findViewById<ImageView>(R.id.imgMovie)
    val nameMovie = itemView.findViewById<TextView>(R.id.tvNameMovie)

    fun data(search: SearchMovie) {
        imageMovie.setImageResource(search.image)
        nameMovie.text = search.name
    }


}