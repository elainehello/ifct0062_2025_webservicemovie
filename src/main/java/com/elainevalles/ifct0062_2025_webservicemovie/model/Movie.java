package com.elainevalles.ifct0062_2025_webservicemovie.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Movie {
    @Id
    @Column(name = "imdbid")  // Match the actual DB column name
    private String imdbID;

    @Column(name = "title")
    private String title;

    @Column(name = "director")
    private String director;

    @Column(name = "year")
    private int year;

    public Movie() {
    }

    public Movie(String imdbID, String title, String director, int year) {
        this.imdbID = imdbID;
        this.title = title;
        this.director = director;
        this.year = year;
    }

    public String getImdbID() {
        return imdbID;
    }

    public void setImdbID(String imdbId) {
        this.imdbID = imdbId;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}