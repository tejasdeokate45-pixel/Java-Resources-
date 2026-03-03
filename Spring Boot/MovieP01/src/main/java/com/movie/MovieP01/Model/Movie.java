package com.movie.MovieP01.Model;

public class Movie {
    private Long id;
    private Double rating;
    private String title;
    private String genre;


    public Movie(){

    }

    public Movie(String genre, Long id, Double rating, String title) {
        this.genre = genre;
        this.id = id;
        this.rating = rating;
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
