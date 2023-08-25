package com.furkankamaci.airport.FlightSearchApi.core.utils.random;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.sql.Date;


public class RandomDate {
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
}
