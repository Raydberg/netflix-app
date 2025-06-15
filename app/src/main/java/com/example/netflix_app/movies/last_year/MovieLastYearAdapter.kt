package com.example.netflix_app.movies.last_year

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.netflix_app.movies.Movie

class MovieLastYearAdapter(val listMoviesLastYear: List<Movie>) :
    RecyclerView.Adapter<MovieLastYearViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MovieLastYearViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return MovieLastYearViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(
        holder: MovieLastYearViewHolder,
        position: Int
    ) {
        holder.data(listMoviesLastYear[position])
    }

    override fun getItemCount(): Int = listMoviesLastYear.size

}