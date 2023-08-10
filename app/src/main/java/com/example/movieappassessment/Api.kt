package com.example.movieappassessment

import com.example.movieappassessment.dataObj.GetMoviesResponse
import com.example.movieappassessment.utils.Credentials
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {
    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = Credentials.API_KEY,
        @Query("page") page: Int
    ): Call<GetMoviesResponse>
}