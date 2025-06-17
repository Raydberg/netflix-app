package com.example.netflix_app.movies.config.viewholder

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.netflix_app.R
import com.example.netflix_app.movies.config.MovieConfig

class ConfigurationManagerViewHolder(inflate: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflate.inflate(R.layout.item_configuration, parent, false)) {

    val tvConfigName: TextView = itemView.findViewById(R.id.tvConfigurationName)
    val iconConfig: ImageView = itemView.findViewById(R.id.ivConfiguration)

    fun data(config: MovieConfig) {
        tvConfigName.text = config.name
        iconConfig.setImageResource(config.icon)
    }


}