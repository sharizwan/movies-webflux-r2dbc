package com.example.movies;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import reactor.core.publisher.Flux;
import com.example.movies.*;

public interface MovieRepository extends ReactiveCrudRepository<Movie, Long> {
    Flux<Movie> findByGenre(String genre);
}
