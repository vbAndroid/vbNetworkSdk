package com.test.networksdk

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.IOException

class NetworkSDK {

//    private val retrofit = Retrofit.Builder()
//        .baseUrl("https://api.themoviedb.org/3/") // Base URL of TMDB API
//        .addConverterFactory(GsonConverterFactory.create())
//        .build()

//    private val apiService = retrofit.create(ApiService::class.java)

    @Throws(IOException::class)
    suspend fun fetchLatestMovies(apiKey: String): String {
//        return apiService.getLatestMovies(apiKey).string()
        return "HI VIJAY How are you?"
    }

//    @Throws(IOException::class)
//    suspend fun fetchPopularMovies(apiKey: String): String {
//        return apiService.getPopularMovies(apiKey).string()
//    }
}