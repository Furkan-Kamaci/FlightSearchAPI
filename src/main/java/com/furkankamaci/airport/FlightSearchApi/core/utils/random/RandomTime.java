package com.furkankamaci.airport.FlightSearchApi.core.utils.random;

import java.sql.Time;
import java.util.concurrent.ThreadLocalRandom;

public class RandomTime {


    public static java.sql.Time randomTime() {
        // Generate a random time within a specific range
        int minHour = 0;
        int maxHour = 23;
        int minMinute = 0;
        int maxMinute = 59;

        int randomHour = ThreadLocalRandom.current().nextInt(minHour, maxHour + 1);
        int randomMinute = ThreadLocalRandom.current().nextInt(minMinute, maxMinute + 1);

        // Create a java.sql.Time object from the random time
        Time randomTime = new Time(randomHour, randomMinute, 0);

        return  randomTime;
    }
}
