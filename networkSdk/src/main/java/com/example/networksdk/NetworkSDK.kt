package com.test.networksdk

import com.example.networksdk.MovieDetails
import com.example.networksdk.MovieResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.IOException

class NetworkSDK {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://api.themoviedb.org/3/") // Base URL of TMDB API
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val apiService = retrofit.create(ApiService::class.java)

    @Throws(IOException::class)
    suspend fun fetchLatestMovies(apiKey: String): String {
//        return apiService.getLatestMovies(apiKey).string()
        return "HI VIJAY How are you?"
    }


    @Throws(IOException::class)
    suspend fun getPopularMovies(): Call<MovieResponse> {
        return apiService.getPopularMovies()
    }

    @Throws(IOException::class)
    fun getMovieDetails(movieId: Int): Call<MovieDetails> {
        return apiService.getMovieDetails(movieId)
    }
}