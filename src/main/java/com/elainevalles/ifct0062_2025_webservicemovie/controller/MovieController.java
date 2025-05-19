package com.elainevalles.ifct0062_2025_webservicemovie.controller;

import com.elainevalles.ifct0062_2025_webservicemovie.model.Movie;

import com.elainevalles.ifct0062_2025_webservicemovie.service.interfaces.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/movies/")
public class MovieController {
    private MovieService movieService;
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping
    public ResponseEntity<Movie> createMovie(@RequestBody Movie movie) {
        Movie newMovie = movieService.create(movie);
        return ResponseEntity.status(HttpStatus.CREATED).body(newMovie);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getMovieById(@PathVariable String id) {
        Movie movie = movieService.findById(id);
        return ResponseEntity.ok().body(Map.of(
                "data", movie,
                "message", "Movie found"
        ));
    }
}