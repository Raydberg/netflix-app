package com.example.netflix_app.profiles

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.zip.Inflater
import com.example.netflix_app.R

class ProfileViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_profile, parent, false)) {


    private var imageProfile: ImageView = itemView.findViewById(R.id.imgProfile)
    private var tvProfile: TextView = itemView.findViewById(R.id.tvName)


    fun data(profile: Profile) {
        imageProfile.setImageResource(profile.image)
        tvProfile.text = profile.name
    }


}