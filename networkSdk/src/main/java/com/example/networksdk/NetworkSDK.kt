package com.test.networksdk

import android.util.Log
import com.example.networksdk.MovieDetails
import com.example.networksdk.MovieResponse
import com.example.networksdk.UpcomingMovieResponse
import retrofit2.Call
import retrofit2.Callback
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
    fun getLatestMovie() :MovieDetails{
        val response = apiService.getLatestMovies().execute()
        if (response.isSuccessful) {
            return response.body() ?: throw IOException("Empty response body")
        } else {
            throw IOException("Unsuccessful response: ${response.code()} ${response.message()}")
        }
    }

    suspend fun fetchPopularMovies(): MovieResponse {
        return try {
            apiService.getPopularMovies1()
        } catch (e: Exception) {
            // Handle exception or rethrow
            throw e
        }
    }


    @Throws(IOException::class)
    fun getMovieDetails(movieId: Int) :MovieDetails{
        val response = apiService.getMovieDetails(movieId).execute()
        if (response.isSuccessful) {
            return response.body() ?: throw IOException("Empty response body")
        } else {
            throw IOException("Unsuccessful response: ${response.code()} ${response.message()}")
        }
    }

    @Throws(IOException::class)
    fun getUpcomingMovies(): UpcomingMovieResponse {
        return apiService.getUpcomingMovies()
    }
}