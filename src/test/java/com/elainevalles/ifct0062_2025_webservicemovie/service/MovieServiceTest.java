package com.elainevalles.ifct0062_2025_webservicemovie.service;

import com.elainevalles.ifct0062_2025_webservicemovie.model.Movie;
import com.elainevalles.ifct0062_2025_webservicemovie.repository.IMovieRepository;
import com.elainevalles.ifct0062_2025_webservicemovie.service.interfaces.MovieService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MovieServiceTest {
    @Autowired
    MovieService movieService;

    @Autowired
    IMovieRepository iMovieRepository;

    @Test
    public void create() {
        Movie movie = movieService.create(new Movie("tt9619824","Destino final: Lazos de sangre","Zach Lipovsky",2025));
        Assertions.assertNotNull(movie);
        movieService.delete(movie);
    }

    @Test
    public void readById() {
        Movie movie = movieService.create(new Movie("tt9619824","Destino final: Lazos de sangre","Zach Lipovsky",2025));
        Assertions.assertNotNull(movie);
        movie = movieService.findById(movie.getImdbID());
        Assertions.assertNotNull(movie);
        movieService.delete(movie);
    }

    @Test
    public void findOneByTitle() {
        Movie movie = movieService.create(new Movie("tt9619824","Destino final: Lazos de sangre","Zach Lipovsky",2025));
        Assertions.assertNotNull(movie);
        Movie readedMovie = movieService.findByTitle("final");
        Assertions.assertNotNull(readedMovie);
        movieService.delete(movie);
    }


}