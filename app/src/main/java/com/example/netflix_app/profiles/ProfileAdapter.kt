package com.example.netflix_app.profiles

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ProfileAdapter(val listProfile: List<Profile>) : RecyclerView.Adapter<ProfileViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProfileViewHolder {
        val inflate = LayoutInflater.from(parent.context)
        return ProfileViewHolder(inflate, parent)
    }

    override fun onBindViewHolder(
        holder: ProfileViewHolder,
        position: Int
    ) {
        holder.data(listProfile[position])
    }

    override fun getItemCount(): Int = listProfile.size
}