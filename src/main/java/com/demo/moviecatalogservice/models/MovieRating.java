package com.demo.moviecatalogservice.models;

public class MovieRating {
    private String moveId;
    private int rating;

    public MovieRating() {
    }

    public MovieRating(String moveId, int rating) {
        this.moveId = moveId;
        this.rating = rating;
    }

    public String getMoveId() {
        return moveId;
    }

    public void setMoveId(String moveId) {
        this.moveId = moveId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
