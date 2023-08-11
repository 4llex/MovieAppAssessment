package com.example.movieappassessment.repository

import com.example.movieappassessment.dataObj.GetMoviesResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    //fetching now_playing movies.
    @GET("movie/now_playing")
    fun getNowPlayingMovies(
        @Query("api_key") apiKey: String = Credentials.API_KEY,
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    //fetching top rated movies.
    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = Credentials.API_KEY,
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    //fetching top rated movies.
    @GET("movie/top_rated")
    fun getTopRatedMovies(
        @Query("api_key") apiKey: String = Credentials.API_KEY,
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    //fetching upcoming movies.
    @GET("movie/upcoming")
    fun getUpcomingMovies(
        @Query("api_key") apiKey: String = Credentials.API_KEY,
        @Query("page") page: Int
    ): Call<GetMoviesResponse>
}