package com.elainevalles.ifct0062_2025_webservicemovie.controller;

import com.elainevalles.ifct0062_2025_webservicemovie.model.Movie;

import com.elainevalles.ifct0062_2025_webservicemovie.service.interfaces.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
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
        if (movie == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(Map.of(
                "data", movie,
                "message", "Movie found"
        ));
    }

    @GetMapping("/search")
    public ResponseEntity<?> findMovie(@RequestParam(name = "s", required = false) String titles,
                                       @RequestParam(name = "i", required = false) String imdbId,
                                       @RequestParam(name = "t", required = false) String title) {

        if (titles != null && !titles.isEmpty()) {
            List<Movie> results = movieService.findMoviesByTitle(titles);
            return ResponseEntity.ok().body(Map.of("data", results, "message", "Results by 's'"));
        } else if (imdbId != null && !imdbId.isEmpty()) {
            Movie movie = movieService.findById(imdbId);
            return ResponseEntity.ok().body(Map.of("data", movie, "message", "Result by 'i'"));
        } else if (title != null && !title.isEmpty()) {
            List<Movie> results = movieService.findMoviesByTitle(title);
            return ResponseEntity.ok().body(Map.of("data", results, "message", "Results by 't'"));
        } else {
            //return ResponseEntity.badRequest().body(Map.of("error", "No valid search parameter provided"));
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No valid search parameter provided");
        }
    }


}