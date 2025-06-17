package com.example.netflix_app.movies.config

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.netflix_app.R
import com.example.netflix_app.movies.config.adapter.ConfigurationAdapter
import com.example.netflix_app.profiles.Profile
import com.example.netflix_app.profiles.ProfileAdapter

class ConfigActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_config)


        val rvCofig = findViewById<RecyclerView>(R.id.rvConfiguration)
        val rvProfiles = findViewById<RecyclerView>(R.id.rvProfiles)
        rvProfiles.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvCofig.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        val listProfiles = listOf<Profile>(
            Profile(R.drawable.ic_profile_1, "Profile1"),
            Profile(R.drawable.ic_profile_1, "Profile1"),
            Profile(R.drawable.ic_profile_1, "Profile1"),
            Profile(R.drawable.ic_profile_1, "Profile1"),
            Profile(R.drawable.ic_profile_1, "Profile1"),
            Profile(R.drawable.ic_profile_1, "Profile1"),
            Profile(R.drawable.ic_profile_1, "Profile1"),
            Profile(R.drawable.ic_profile_1, "Profile1"),
            Profile(R.drawable.ic_profile_1, "Profile1"),
//            Profile(R.drawable.ic_profile_1, "Profile2")
        )

        val listConfigName = listOf<MovieConfig>(
            MovieConfig(R.drawable.baseline_arrow_back_24, "Notificaciones"),
            MovieConfig(R.drawable.baseline_arrow_back_24, "Mi Lista"),
            MovieConfig(R.drawable.baseline_arrow_back_24, "Configuraciones de la App"),
            MovieConfig(R.drawable.baseline_arrow_back_24, "Cuenta"),
            MovieConfig(R.drawable.baseline_arrow_back_24, "Ayuda"),
        )

        val adapterProfile = ProfileAdapter(listProfiles) {}
        val adapter = ConfigurationAdapter(listConfigName)
        rvCofig.adapter = adapter
        rvProfiles.adapter = adapterProfile
    }
}