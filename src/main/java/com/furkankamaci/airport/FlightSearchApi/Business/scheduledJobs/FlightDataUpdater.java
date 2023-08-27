package com.furkankamaci.airport.FlightSearchApi.Business.scheduledJobs;

import com.furkankamaci.airport.FlightSearchApi.Business.IAirportService;
import com.furkankamaci.airport.FlightSearchApi.Business.IFlightService;
import com.furkankamaci.airport.FlightSearchApi.Entity.Flight;
import com.furkankamaci.airport.FlightSearchApi.core.utils.mockApi.FlightDataGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FlightDataUpdater {

    @Autowired
    IFlightService flightService;

    @Autowired
    IAirportService airportService;

    //    @Scheduled(cron= "0 0 0 * * *") // every day at midnight
    @Scheduled(cron = "*/5 * * * * *") // every 5 sec
    public void updateFlightData() {

        List<Flight> newData = FlightDataGenerator.getRandomFlights(airportService.findAll());
        for (Flight f : newData) {
            try {
                flightService.addFlight(f);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("new flights added..");
    }
}
