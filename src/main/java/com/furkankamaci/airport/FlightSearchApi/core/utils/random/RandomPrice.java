package com.furkankamaci.airport.FlightSearchApi.core.utils.random;

import java.util.concurrent.ThreadLocalRandom;

public class RandomPrice {


    public static double getRandomPrice(double min, double max) {
        int[] validDecimalValues = new int[] { 0, 50, 99 };
        int randomDecimalIndex = ThreadLocalRandom.current().nextInt(validDecimalValues.length);
        int selectedDecimalValue = validDecimalValues[randomDecimalIndex];

        double randomValue = ThreadLocalRandom.current().nextDouble(min, max);
        int integerValue = (int) randomValue;

        double finalPrice = integerValue + (selectedDecimalValue / 100.0);
        return finalPrice;
    }
}
