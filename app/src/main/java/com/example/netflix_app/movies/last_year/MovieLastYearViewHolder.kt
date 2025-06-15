package com.example.netflix_app.movies.last_year

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import java.util.zip.Inflater

import com.example.netflix_app.R
import com.example.netflix_app.movies.Movie

class MovieLastYearViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_movie_last_year, parent, false)) {

    private var imgMovie: ImageView = itemView.findViewById(R.id.imgMovie)

    fun data(movie: Movie) {
        imgMovie.setImageResource(movie.image)
    }
}