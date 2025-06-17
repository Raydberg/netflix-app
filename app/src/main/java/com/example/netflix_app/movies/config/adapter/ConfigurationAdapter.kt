package com.example.netflix_app.movies.config.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.netflix_app.movies.config.MovieConfig
import com.example.netflix_app.movies.config.viewholder.ConfigurationManagerViewHolder

class ConfigurationAdapter(val listItemConfiguration: List<MovieConfig>) :
    RecyclerView.Adapter<ConfigurationManagerViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ConfigurationManagerViewHolder {
        val inflate = LayoutInflater.from(parent.context)
        return ConfigurationManagerViewHolder(inflate, parent)
    }

    override fun onBindViewHolder(
        holder: ConfigurationManagerViewHolder,
        position: Int
    ) {
        holder.data(listItemConfiguration[position])
    }

    override fun getItemCount(): Int = listItemConfiguration.size

}