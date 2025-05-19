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

//    @Test
//    public void create() {
//        Movie movie1 = movieService.create(new Movie("tt9619825", "Echoes of the Future", "Nora Michaels", 2023));
//        Assertions.assertNotNull(movie1);
//
//        Movie movie2 = movieService.create(new Movie("tt9619826", "The Last Horizon", "Carlos Rivera", 2024));
//        Assertions.assertNotNull(movie2);
//
//        Movie movie3 = movieService.create(new Movie("tt9619827", "Neon Depths", "Akira Yamamoto", 2023));
//        Assertions.assertNotNull(movie3);
//
//        Movie movie4 = movieService.create(new Movie("tt9619828", "Whispers in Time", "Elena Petrova", 2025));
//        Assertions.assertNotNull(movie4);
//
//        Movie movie5 = movieService.create(new Movie("tt9619829", "The Silent Accord", "Mason King", 2022));
//        Assertions.assertNotNull(movie5);
//
//        Movie movie6 = movieService.create(new Movie("tt9619830", "Carbon Dreams", "Yasmin Al-Fayed", 2023));
//        Assertions.assertNotNull(movie6);
//
//        Movie movie7 = movieService.create(new Movie("tt9619831", "Starlight Protocol", "Rajiv Mehta", 2024));
//        Assertions.assertNotNull(movie7);
//
//        Movie movie8 = movieService.create(new Movie("tt9619832", "Voidwalker", "Sophie Lang", 2023));
//        Assertions.assertNotNull(movie8);
//
//        Movie movie9 = movieService.create(new Movie("tt9619833", "Fragments of Eden", "Thomas Benoit", 2024));
//        Assertions.assertNotNull(movie9);
//
//        Movie movie10 = movieService.create(new Movie("tt9619834", "Dominion Rising", "Grace Kim", 2025));
//        Assertions.assertNotNull(movie10);
//    }


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