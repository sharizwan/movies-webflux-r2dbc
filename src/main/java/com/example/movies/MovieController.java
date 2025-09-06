package com.example.movies;

import java.util.List;

//package com.example.movies.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/movies")
public class MovieController {
    private final MovieService service;

    public MovieController(MovieService service) {
    	System.out.println("In Service--------->");
        this.service = service;
    }

    
	/*
	 * @GetMapping public List<Movie> getAllMovies() { return List.of( new Movie(1L,
	 * "Inception"), new Movie(2L, "Interstellar") ); }
	 */
	
	  @GetMapping public Flux<Movie> getAllMovies() { return
	  service.getAllMovies(); }
	 

    @GetMapping("/{id}")
    public Mono<Movie> getMovieById(@PathVariable Long id) {
        return service.getMovieById(id);
    }

    @GetMapping("/genre/{genre}")
    public Flux<Movie> getMoviesByGenre(@PathVariable String genre) {
        return service.getMoviesByGenre(genre);
    }

    @PostMapping
    public Mono<Movie> addMovie(@RequestBody Movie movie) {
        return service.addMovie(movie);
    }
}

