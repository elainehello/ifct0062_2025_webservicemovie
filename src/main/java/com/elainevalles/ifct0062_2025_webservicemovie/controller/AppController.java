package com.elainevalles.ifct0062_2025_webservicemovie.controller;

import com.elainevalles.ifct0062_2025_webservicemovie.repository.IMovieRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AppController {
    IMovieRepository movieRepository;

    public AppController(IMovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }


}
