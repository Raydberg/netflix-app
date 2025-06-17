package com.example.netflix_app.movies.search

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.netflix_app.R
import com.example.netflix_app.movies.config.ConfigActivity

class SearchMovieActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_search_movie)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

        val ivProfile: ImageView = findViewById(R.id.ivProfile)

        ivProfile.setOnClickListener {
            startActivity(Intent(this, ConfigActivity::class.java))
        }

        val rvSearhMovie = findViewById<RecyclerView>(R.id.rvSearchMovie)

        rvSearhMovie.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val listSearchMovie = listOf<SearchMovie>(
            SearchMovie(R.drawable.ic_movie_last_year_1, "La casa de papel"),
            SearchMovie(R.drawable.ic_movie_last_year_1, "La casa de papel"),
            SearchMovie(R.drawable.ic_movie_last_year_1, "La casa de papel"),
            SearchMovie(R.drawable.ic_movie_last_year_1, "La casa de papel"),
            SearchMovie(R.drawable.ic_movie_last_year_1, "La casa de papel"),
            SearchMovie(R.drawable.ic_movie_last_year_1, "La casa de papel"),
            SearchMovie(R.drawable.ic_movie_last_year_1, "La casa de papel"),
            SearchMovie(R.drawable.ic_movie_last_year_1, "La casa de papel"),
            SearchMovie(R.drawable.ic_movie_last_year_1, "La casa de papel"),
            SearchMovie(R.drawable.ic_movie_last_year_1, "La casa de papel"),
            SearchMovie(R.drawable.ic_movie_last_year_1, "La casa de papel"),
            SearchMovie(R.drawable.ic_movie_last_year_1, "La casa de papel"),
            SearchMovie(R.drawable.ic_movie_last_year_1, "La casa de papel"),
            SearchMovie(R.drawable.ic_movie_last_year_1, "La casa de papel"),
        )

        val adapter = SearchMovieAdapter(listSearchMovie)

        rvSearhMovie.adapter = adapter


    }
}