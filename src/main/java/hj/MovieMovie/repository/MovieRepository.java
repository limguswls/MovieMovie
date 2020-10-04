package hj.MovieMovie.repository;

import hj.MovieMovie.dto.Movie;

import java.util.Optional;

public interface MovieRepository {
    void save(Movie movie);
    Optional<Movie> findById(long movieId);
}
