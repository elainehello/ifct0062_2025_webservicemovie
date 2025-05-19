package com.elainevalles.ifct0062_2025_webservicemovie.service.interfaces;

import com.elainevalles.ifct0062_2025_webservicemovie.model.Movie;

import java.util.List;

public interface MovieService {
    public Movie create(Movie movie);
    public void delete(Movie movie);
    public Movie findById(String id);
    public Movie findByName(String title);
    public List<Movie> findMoviesByName(String title);
}
