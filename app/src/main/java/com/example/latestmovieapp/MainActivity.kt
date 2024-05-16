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
        CoroutineScope(Dispatchers.IO).launch {
                try {
                    val movieResponse = networkSDK.fetchPopularMovies()
                    Log.d("latestMovies MovieResponse", movieResponse.toString())

//                    val popularMovies = networkSDK.getPopularMovies()
//                    popularMovies.enqueue(object : Callback<MovieResponse> {
//                        override fun onResponse(call: Call<MovieResponse>, response: Response<MovieResponse>) {
//                            if (response.isSuccessful) {
//                                val movieResponse = response.body()
//                                movieResponse?.let {
//                                    val movies = it.movies
//                                    for (movie in movies) {
//                                        Log.d("latestMovies", "Title: ${movie.title}, Release Date: ${movie.releaseDate}")
//                                    }
//                                }
//                            } else {
//                                Log.e("API", "Failed to fetch popular movies: ${response.code()}")
//                            }
//
//
//                        }
//
//                        override fun onFailure(call: Call<MovieResponse>, t: Throwable) {
//                            Log.e("API", "Failed to fetch popular movies", t)
//                        }
//                    })
                } catch (e: Exception) {
                    Log.e("API", "Failed to fetch popular movies", e)
                }


        }
        CoroutineScope(Dispatchers.IO).launch{
            val moviesData = networkSDK.getMovieDetails(1290833)
                    moviesData.enqueue(object : Callback<MovieDetails>{
                        override fun onResponse(
                            call: Call<MovieDetails>,
                            response: Response<MovieDetails>
                        ) {
                            if (response.isSuccessful) {
                                val movieResponse = response.body()
                                movieResponse?.let {
                                    val movies = it.title
                                    Log.d("latestMoviesDetails", "Title: ${movies}")
                                }
                            }
                        }
                        override fun onFailure(call: Call<MovieDetails>, t: Throwable) {
                            Log.d("latestMovies error", "Title: ${t.message}")
                        }
                    }

                    )

        }
    }
}