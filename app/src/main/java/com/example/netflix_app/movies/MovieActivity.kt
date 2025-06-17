package com.example.netflix_app.movies

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.netflix_app.MainActivity
import com.example.netflix_app.R
import com.example.netflix_app.movies.continue_watching.ContinueWatching
import com.example.netflix_app.movies.continue_watching.ContinueWatchingAdapter
import com.example.netflix_app.movies.last_year.MovieLastYearAdapter
import com.example.netflix_app.movies.search.SearchMovieActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MovieActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_movie)


        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.item_1 -> {
                    if (this !is MainActivity) {
                        startActivity(Intent(this, MainActivity::class.java))
                        finish()
                    }
                    true
                }

                R.id.item_3 -> {
                    if (this !is SearchMovieActivity) {
                        startActivity(Intent(this, SearchMovieActivity::class.java))
                        finish()
                    }
                    true
                }

                else -> false
            }
        }


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