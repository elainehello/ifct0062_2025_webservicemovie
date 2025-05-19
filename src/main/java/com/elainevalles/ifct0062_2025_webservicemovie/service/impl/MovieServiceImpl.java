package com.elainevalles.ifct0062_2025_webservicemovie.service.impl;

import com.elainevalles.ifct0062_2025_webservicemovie.model.Movie;
import com.elainevalles.ifct0062_2025_webservicemovie.repository.IMovieRepository;
import com.elainevalles.ifct0062_2025_webservicemovie.service.interfaces.MovieService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    private IMovieRepository iMovieRepository;

    public MovieServiceImpl(IMovieRepository iMovieRepository) {
        this.iMovieRepository = iMovieRepository;
    }

    @Override
    public Movie create(Movie movie) {
        return iMovieRepository.save(movie);
    }

    @Override
    public void delete(Movie movie) {
        iMovieRepository.delete(movie);
    }

    @Override
    public Movie findById(String id) {
        return iMovieRepository.findById(id).orElse(null);
    }

    @Override
    public Movie findByName(String title) {
        return iMovieRepository.findOneByTitleContaining(title).stream().findFirst().orElse(null);
    }

    @Override
    public List<Movie> findMoviesByName(String title) {
        return List.of();
    }
}
