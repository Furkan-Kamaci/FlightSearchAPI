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

    //    @Scheduled(cron= "0 0 0 * * *") // hergun gece yarisinda
    @Scheduled(cron = "*/5 * * * * *") // her saniye
    public void updateFlightData() {
        System.out.println("new flights added..");

        List<Flight> newData = FlightDataGenerator.getRandomFlights(airportService.findAll());
        System.out.println(newData);
        for (Flight f : newData) {
            try {
//                flightService.addFlight(f);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
