package com.example.netflix_app.movies.continue_watching

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ContinueWatchingAdapter(val listMovieContinueWatching: List<ContinueWatching>) :
    RecyclerView.Adapter<ContinueWatchingViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ContinueWatchingViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ContinueWatchingViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(
        holder: ContinueWatchingViewHolder,
        position: Int
    ) {
        holder.data(listMovieContinueWatching[position])
    }

    override fun getItemCount(): Int = listMovieContinueWatching.size
}