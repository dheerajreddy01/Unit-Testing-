package com.acetech;

import java.util.List;

public class RentalCart {

    private RentalService rentalService;
    private List<Movie> movies;

    public RentalService getRentalService() {
        return rentalService;
    }

    public void setRentalService(RentalService rentalService) {
        this.rentalService = rentalService;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }


    public double getTotalPrice() {
        double totalAmount = 0.0;

        for (Movie movie : movies) {
            double rentalPrice = rentalService.getRentalPrice(movie);
            double lateFee= rentalService.calculateLateFee(rentalPrice, movie.getDaysLate());
            totalAmount = totalAmount + (rentalPrice + lateFee);
        }


        return totalAmount;
    }

}
