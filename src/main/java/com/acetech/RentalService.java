package com.acetech;

public interface RentalService {
    double getRentalPrice(Movie movie);
    double calculateLateFee(double amount, int daysLate);

}
