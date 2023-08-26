package com.furkankamaci.airport.FlightSearchApi.restApi;

import com.furkankamaci.airport.FlightSearchApi.Entity.Flight;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/mock-api")
public class MockFlightController {

    public List<Flight> getMockFlightInfo() {
        List<Flight> flights = new ArrayList<>();
        //   Flight f = new Flight();
        //      f.setDepartureAirportID("JFK");
        //      f.setArrivalAirportID("LAX");
        //      f.setDepartureDate(Date.valueOf("2023-2-4"));
        //
        //flights.add(f);
        Flight ff = new Flight(
                UUID.fromString("ce32abc5-4423-11ee-83g0-38f33b91f0c3"),
                UUID.fromString("ce32abc5-4423-11ee-83e0-38f3ab9130c3"), // JFK
                UUID.fromString("ce32b58d-4423-11ee-83e0-38f3ab9130c3"), // LAX
                Date.valueOf("2023-2-4"),
                Time.valueOf("08:00:00"),
                null,
                null,
                250.0
        );
        //      boolean add = flights.add();
        flights.add(ff);

        return flights;
    }
}
