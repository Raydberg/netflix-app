package com.example.netflix_app.movies.search

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class SearchMovieAdapter(val listSearchMovie: List<SearchMovie>) :
    RecyclerView.Adapter<SearchMovieViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SearchMovieViewHolder {
        val inflate = LayoutInflater.from(parent.context)
        return SearchMovieViewHolder(inflate, parent)
    }

    override fun onBindViewHolder(
        holder: SearchMovieViewHolder,
        position: Int
    ) {
        holder.data(listSearchMovie[position])
    }

    override fun getItemCount(): Int = listSearchMovie.size

}