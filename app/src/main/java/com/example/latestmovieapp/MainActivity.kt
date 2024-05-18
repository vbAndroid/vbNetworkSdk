package com.example.latestmovieapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.networksdk.MovieDetails
import com.example.networksdk.MovieResponse
import com.test.networksdk.NetworkSDK
import kotlinx.coroutines.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // here will start our project work
        setContentView(R.layout.activity_main)
        val networkSDK = NetworkSDK()
        CoroutineScope(Dispatchers.IO).launch{
            try {
                val moviesResponse = networkSDK.getLatestMovie()
                Log.e("MovieResponse","getUpcomingMovies res:${ moviesResponse}")
            } catch (e: Exception) {
                Log.e("API", "Failed to fetch popular movies", e)
            }
        }

    }
}