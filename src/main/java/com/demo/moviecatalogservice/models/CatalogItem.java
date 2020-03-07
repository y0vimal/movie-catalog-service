package com.demo.moviecatalogservice.models;

public class CatalogItem {
    private String movieId;
    private String movieName;
    private String desc;
    private int rating;
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }



    public CatalogItem() {
    }

    public CatalogItem(String movieId, String movieName, String desc, int rating) {
        this.movieName = movieName;
        this.movieId = movieId;
        this.desc = desc;
        this.rating = rating;
    }


    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        rating = rating;
    }
}
