package com.example.movies;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class MovieService {
    private final MovieRepository repo;

    public MovieService(MovieRepository repo) {
        this.repo = repo;
    }

    public Flux<Movie> getAllMovies() {
        return repo.findAll();
    }

    public Mono<Movie> getMovieById(Long id) {
        return repo.findById(id);
    }

    public Flux<Movie> getMoviesByGenre(String genre) {
        return repo.findByGenre(genre);
    }

    public Mono<Movie> addMovie(Movie movie) {
        return repo.save(movie);
    }
}
