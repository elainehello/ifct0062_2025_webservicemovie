package com.elainevalles.ifct0062_2025_webservicemovie.repository;

import com.elainevalles.ifct0062_2025_webservicemovie.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface IMovieRepository extends JpaRepository<Movie, String> {

    public List<Movie> findOneByTitleContaining(String title);


}
