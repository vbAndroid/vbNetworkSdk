package com.test.networksdk

import com.example.networksdk.MovieDetails
import com.example.networksdk.MovieResponse
import com.example.networksdk.UpcomingMovieResponse
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {


    @Headers("Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI5NTgyOTc4ZDU4MGQ2MzJlMzJjZWE0OTc0ODY3ODRmMCIsInN1YiI6IjY2NDRhOWZmMDQ3NTM1OGZmOTViY2RlOCIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.3ME1lJYZv56CjsfNNtDRXHKbdzeQmNRgFqfSRoTeIdU")
    @GET("movie/popular?language=en-US&page=1")
    suspend fun getPopularMovies1(): MovieResponse

    @Headers("Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI5NTgyOTc4ZDU4MGQ2MzJlMzJjZWE0OTc0ODY3ODRmMCIsInN1YiI6IjY2NDRhOWZmMDQ3NTM1OGZmOTViY2RlOCIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.3ME1lJYZv56CjsfNNtDRXHKbdzeQmNRgFqfSRoTeIdU")
    @GET("movie/latest")
    fun getLatestMovies():Call<MovieDetails>

    @Headers("Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI5NTgyOTc4ZDU4MGQ2MzJlMzJjZWE0OTc0ODY3ODRmMCIsInN1YiI6IjY2NDRhOWZmMDQ3NTM1OGZmOTViY2RlOCIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.3ME1lJYZv56CjsfNNtDRXHKbdzeQmNRgFqfSRoTeIdU")
    @GET("movie/{movie_id}")
    fun getMovieDetails(
        @Path("movie_id") movieId: Int,
        @Query("language") language: String = "en-US"
    ): Call<MovieDetails>

    @Headers("Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI5NTgyOTc4ZDU4MGQ2MzJlMzJjZWE0OTc0ODY3ODRmMCIsInN1YiI6IjY2NDRhOWZmMDQ3NTM1OGZmOTViY2RlOCIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.3ME1lJYZv56CjsfNNtDRXHKbdzeQmNRgFqfSRoTeIdU")
    @GET("movie/upcoming?language=en-US&page=1")
    fun getUpcomingMovies(): UpcomingMovieResponse

}
