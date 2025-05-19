package com.elainevalles.ifct0062_2025_webservicemovie.service.interfaces;

import com.elainevalles.ifct0062_2025_webservicemovie.model.Movie;

import java.util.List;

public interface MovieService {
    public void create(Movie movie);
    public void findById(String id);
    public void findByName(String title);
    public List<Movie> findMoviesByName(String title);
}
