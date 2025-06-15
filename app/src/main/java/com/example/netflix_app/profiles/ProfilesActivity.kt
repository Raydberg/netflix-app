package com.example.netflix_app.profiles

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.netflix_app.R

class ProfilesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profiles)
        var rvProfiles = findViewById<RecyclerView>(R.id.rvProfiles)
        rvProfiles.layoutManager = GridLayoutManager(this, 2)

        val listProfiles = listOf<Profile>(
            Profile(R.drawable.ic_profile_1, "Ryan"),
            Profile(R.drawable.ic_profile_1, "Gabriel"),
            Profile(R.drawable.ic_profile_1, "Chuquival"),
            Profile(R.drawable.ic_profile_1, "Raydberg"),
            Profile(R.drawable.ic_profile_1, "Chuquival"),
            Profile(R.drawable.ic_profile_1, "Gil"),
            Profile(R.drawable.ic_profile_1, "Drashti"),
            Profile(R.drawable.ic_profile_1, "Drashti"),
            Profile(R.drawable.ic_profile_1, "Drashti"),
            Profile(R.drawable.ic_profile_1, "Drashti"),
            Profile(R.drawable.ic_profile_1, "Drashti"),
            Profile(R.drawable.ic_profile_1, "Drashti"),
        )
        val adapter = ProfileAdapter(listProfiles)
        rvProfiles.adapter = adapter
    }
}