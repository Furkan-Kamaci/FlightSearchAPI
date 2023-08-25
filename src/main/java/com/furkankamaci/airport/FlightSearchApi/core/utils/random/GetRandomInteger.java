package com.furkankamaci.airport.FlightSearchApi.core.utils.random;

import java.util.Random;

public class GetRandomInteger {

    // return random number between 0 and range-1
    public static Integer getRandomInteger(int range){
        Random random = new Random();
        int randomNumber = random.nextInt(range);
        return randomNumber;
    }
}
