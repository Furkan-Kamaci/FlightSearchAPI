package com.furkankamaci.airport.FlightSearchApi.core.utils.random;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class MockApiGenerator {

    public static Integer getRandomInteger(int range) {
        Random random = new Random();
        int randomNumber = random.nextInt(range);
        return randomNumber;
    }

    public static java.sql.Date setRandomDepartureDateWithinNextWeek() {
        LocalDate currentDate = LocalDate.now();
        LocalDate maxDate = currentDate.plusDays(7);

        Random random = new Random();

        long minDays = currentDate.until(maxDate).getDays();
        long randomDays = random.nextInt((int) minDays) + 1;

        LocalDate randomDate = currentDate.plusDays(randomDays);

        Calendar calendar = new GregorianCalendar();
        calendar.set(randomDate.getYear(), randomDate.getMonthValue() - 1, randomDate.getDayOfMonth());

        return Date.valueOf(randomDate);
    }

    public static double getRandomPrice(double min, double max) {
        int[] validDecimalValues = new int[]{0, 50, 99};
        int randomDecimalIndex = ThreadLocalRandom.current().nextInt(validDecimalValues.length);
        int selectedDecimalValue = validDecimalValues[randomDecimalIndex];

        double randomValue = ThreadLocalRandom.current().nextDouble(min, max);
        int integerValue = (int) randomValue;

        double finalPrice = integerValue + (selectedDecimalValue / 100.0);
        return finalPrice;
    }

    public static java.sql.Time getRandomTime() {
        // Generate a random time within a specific range
        int minHour = 0;
        int maxHour = 23;
        int minMinute = 0;
        int maxMinute = 59;

        int randomHour = ThreadLocalRandom.current().nextInt(minHour, maxHour + 1);
        int randomMinute = ThreadLocalRandom.current().nextInt(minMinute, maxMinute + 1);

        // Create a java.sql.Time object from the random time
        Time randomTime = new Time(randomHour, randomMinute, 0);

        return randomTime;
    }
}
