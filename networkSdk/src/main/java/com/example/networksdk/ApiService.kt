package com.test.networksdk

import com.example.networksdk.Movie
import com.example.networksdk.MovieDetails
import com.example.networksdk.MovieResponse
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("movie/latest")
    suspend fun getLatestMovies(@Query("api_key") apiKey: String): ResponseBody


    @Headers("Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI5NTgyOTc4ZDU4MGQ2MzJlMzJjZWE0OTc0ODY3ODRmMCIsInN1YiI6IjY2NDRhOWZmMDQ3NTM1OGZmOTViY2RlOCIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.3ME1lJYZv56CjsfNNtDRXHKbdzeQmNRgFqfSRoTeIdU")
    @GET("movie/popular?language=en-US&page=1")
    fun getPopularMovies(): Call<MovieResponse>

    @Headers("Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI5NTgyOTc4ZDU4MGQ2MzJlMzJjZWE0OTc0ODY3ODRmMCIsInN1YiI6IjY2NDRhOWZmMDQ3NTM1OGZmOTViY2RlOCIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.3ME1lJYZv56CjsfNNtDRXHKbdzeQmNRgFqfSRoTeIdU")
    @GET("movie/popular?language=en-US&page=1")
    suspend fun getPopularMovies1(): Movie

    @Headers("Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI5NTgyOTc4ZDU4MGQ2MzJlMzJjZWE0OTc0ODY3ODRmMCIsInN1YiI6IjY2NDRhOWZmMDQ3NTM1OGZmOTViY2RlOCIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.3ME1lJYZv56CjsfNNtDRXHKbdzeQmNRgFqfSRoTeIdU")
    @GET("movie/popular?language=en-US&page=1")
    fun getLatestMovies(): Call<MovieResponse>

    @Headers("Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI5NTgyOTc4ZDU4MGQ2MzJlMzJjZWE0OTc0ODY3ODRmMCIsInN1YiI6IjY2NDRhOWZmMDQ3NTM1OGZmOTViY2RlOCIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.3ME1lJYZv56CjsfNNtDRXHKbdzeQmNRgFqfSRoTeIdU")
    @GET("movie/{movie_id}")
    fun getMovieDetails(
        @Path("movie_id") movieId: Int,
        @Query("language") language: String = "en-US"
    ): Call<MovieDetails>

}
