package com.anushka.tmdbclient.data.domain.repository

import com.anushka.tmdbclient.data.model.movie.Movie

interface MovieRepository {

    suspend fun getMovies(): List<Movie>?

    suspend fun updateMovies(): List<Movie>?


}