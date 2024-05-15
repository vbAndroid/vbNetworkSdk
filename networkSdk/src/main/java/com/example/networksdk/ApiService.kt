package com.test.networksdk

import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("movie/latest")
    suspend fun getLatestMovies(@Query("api_key") apiKey: String): ResponseBody

    @GET("movie/popular")
    suspend fun getPopularMovies(@Query("api_key") apiKey: String): ResponseBody


}
