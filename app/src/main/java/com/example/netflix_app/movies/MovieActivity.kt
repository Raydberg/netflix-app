package com.example.netflix_app.movies

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.netflix_app.R
import com.example.netflix_app.movies.continue_watching.ContinueWatching
import com.example.netflix_app.movies.continue_watching.ContinueWatchingAdapter
import com.example.netflix_app.movies.last_year.MovieLastYearAdapter

class MovieActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_movie)

        val rvMoviesLastYear = findViewById<RecyclerView>(R.id.rvMoviesLastYear)
        val rvContinueWatching = findViewById<RecyclerView>(R.id.rvContinueWatching)


        rvMoviesLastYear.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        rvContinueWatching.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)


        val moviesLastYear = listOf<Movie>(
            Movie(R.drawable.ic_movie_last_year_1),
            Movie(R.drawable.ic_movie_portada),
            Movie(R.drawable.ic_movie_last_year_1),
            Movie(R.drawable.ic_movie_portada),
            Movie(R.drawable.ic_movie_portada),
        )

        val continueWatching = listOf<ContinueWatching>(
            ContinueWatching(R.drawable.ic_movie_portada),
            ContinueWatching(R.drawable.ic_movie_portada),
            ContinueWatching(R.drawable.ic_movie_portada),
            ContinueWatching(R.drawable.ic_movie_portada),
            ContinueWatching(R.drawable.ic_movie_portada),
            ContinueWatching(R.drawable.ic_movie_portada),
        )

        val adapter = MovieLastYearAdapter(moviesLastYear)
        val adapterContinueWatching = ContinueWatchingAdapter(continueWatching)
        rvContinueWatching.adapter = adapterContinueWatching
        rvMoviesLastYear.adapter = adapter

    }
}