package com.example.movieappassessment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.movieappassessment.repository.MoviesRepository

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MoviesRepository.getPopularMovies()
    }
}