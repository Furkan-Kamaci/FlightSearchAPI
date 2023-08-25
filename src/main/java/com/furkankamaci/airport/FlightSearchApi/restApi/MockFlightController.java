package com.furkankamaci.airport.FlightSearchApi.restApi;

import aj.org.objectweb.asm.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.furkankamaci.airport.FlightSearchApi.Entity.Flight;
import java.io.IOException;
import java.sql.Date;
import java.sql.Time;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
      1,
      "JFK",
      "LAX",
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
