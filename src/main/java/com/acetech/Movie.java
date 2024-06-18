package com.acetech;

public class Movie {


    private String movieId;
    private String title;
    private String releaseYear;
    private int daysLate;

    public Movie(String movieId, String title, String releaseYear, int daysLate) {
        this.movieId = movieId;
        this.title = title;
        this.releaseYear = releaseYear;
        this.daysLate = daysLate;

    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getDaysLate() {
        return daysLate;
    }

    public void setDaysLate(int daysLate) {
        this.daysLate = daysLate;
    }


}

