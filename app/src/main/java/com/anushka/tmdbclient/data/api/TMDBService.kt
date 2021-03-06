package com.anushka.tmdbclient.data.api

import com.anushka.tmdbclient.data.model.artist.ArtistList
import com.anushka.tmdbclient.data.model.movie.MovieList
import com.anushka.tmdbclient.data.model.tvshow.TvShowList
import retrofit2.Response
import retrofit2.http.GET

interface TMDBService {



    @GET("movie/popular")
    suspend fun getPopularMovies(@retrofit2.http.Query("api_key")apiKey:String): Response<MovieList>


    @GET("tv/popular")
    suspend fun getPopularTvShows(@retrofit2.http.Query("api_key")apiKey:String): Response<TvShowList>

    @GET("person/popular")
    suspend fun getPopularArtist(@retrofit2.http.Query("api_key")apiKey:String): Response<ArtistList>
}