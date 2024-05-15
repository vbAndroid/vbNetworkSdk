package com.example.networksdk

import com.google.gson.annotations.SerializedName

data class MovieResponse(
    @SerializedName("results")
    val movies: List<Movie>
)

data class Movie(
    val id: Long,
    val title: String,
    val original_title:String,
    val overview: String,
    @SerializedName("release_date")
    val releaseDate: String,
    @SerializedName("poster_path")
    val posterPath: String,
    @SerializedName("vote_average")
    val voteAverage: Double,
    @SerializedName("vote_count")
    val voteCount: Int

)


data class MovieDetails(
    val id: Int,
    val title: String,
    val original_title:String,
    val backdrop_path:String,
    val overview:String,
    val status:String,
    val vote_average:Float,
    val vote_count:Int,
    val revenue:Int,
    val budget:Int,




    // Add other properties as needed
)