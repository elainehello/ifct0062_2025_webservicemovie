package com.elainevalles.ifct0062_2025_webservicemovie.service;

import com.elainevalles.ifct0062_2025_webservicemovie.model.Movie;
import com.elainevalles.ifct0062_2025_webservicemovie.service.impl.MovieServiceImpl;
import com.elainevalles.ifct0062_2025_webservicemovie.service.interfaces.MovieService;
import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MovieServiceTest {

    @Autowired
    MovieService movieService;

    @Autowired
    MovieServiceImpl movieServiceImpl;

    @Test
    public void create() {
        Movie movie = movieService.create(new Movie("tt0084503", "Pink Floyd: The Wall (El muro)", "Alan Parker", 1982));
        Assertions.assertNotNull(movie);
        movieService.delete(movie);
    }

    @Test
    public void readById() {
        // First, create the movie
        Movie createdMovie = movieService.create(
                new Movie("tt0084503", "Pink Floyd: The Wall (El muro)", "Alan Parker", 1982)
        );

        // Then retrieve it
        Movie movie = movieService.findById("tt0084503");
        Assertions.assertNotNull(movie);

        // Redundant second check (optional)
        movie = movieService.findById(movie.getImdbID());
        Assertions.assertNotNull(movie);

        // Clean up
        movieService.delete(movie);
    }

    @Test
    public void readByName() {
        Movie createdMovie = movieService.create(
                new Movie("tt0084503", "Pink Floyd: The Wall (El muro)", "Alan Parker", 1982)
        );
        Movie movie = movieService.findByName("Pink Floyd: The Wall (El muro)");
        Assertions.assertNotNull(movie);
        movieService.delete(movie);
    }

}
