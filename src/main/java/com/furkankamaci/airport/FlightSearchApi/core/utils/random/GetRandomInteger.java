package com.furkankamaci.airport.FlightSearchApi.core.utils.random;

import java.util.Random;

public class GetRandomInteger {

    public static Integer getRandomInteger(int range) {
        Random random = new Random();
        int randomNumber = random.nextInt(range);
        return randomNumber;
    }
}
