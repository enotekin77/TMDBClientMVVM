package com.anushka.tmdbclient.data.domain.usercase

import com.anushka.tmdbclient.data.domain.repository.MovieRepository
import com.anushka.tmdbclient.data.model.movie.Movie

class UpdateMoviesUserCase(private val movieRepository: MovieRepository) {

    suspend fun execute(): List<Movie>? = movieRepository.updateMovies()




}