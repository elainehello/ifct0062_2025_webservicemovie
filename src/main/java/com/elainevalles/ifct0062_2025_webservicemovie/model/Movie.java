package com.elainevalles.ifct0062_2025_webservicemovie.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Movie {
    @Id
    private String  imdbID;
    private String title;
    private String director;
    private Integer year;

    public Movie() {

    }
    public Movie(String imdbID, String title, String director, Integer year) {
        this.imdbID = imdbID;
        this.title = title;
        this.director = director;
        this.year = year;
    }

    public String getImdbID() {
        return imdbID;
    }

    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "imdbID='" + imdbID + '\'' +
                ", title='" + title + '\'' +
                ", Director='" + director + '\'' +
                ", year=" + year +
                '}';
    }
}
