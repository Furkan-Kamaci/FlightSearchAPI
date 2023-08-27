package com.furkankamaci.airport.FlightSearchApi.core.utils.mockApi;

import com.furkankamaci.airport.FlightSearchApi.Business.IAirportService;
import com.furkankamaci.airport.FlightSearchApi.Entity.Airport;
import com.furkankamaci.airport.FlightSearchApi.Entity.Flight;
import com.furkankamaci.airport.FlightSearchApi.core.utils.random.*;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Data
public class FlightDataGenerator {

    @Autowired
    IAirportService airportService;

    public static List<Flight> getRandomFlights(List<Airport> airportList) {

        List<Flight> flights = new ArrayList<>();

        int i = 0;
        while (i < 3) {
            flights.add(FlightDataGenerator.getRandomFlight(airportList));
            i++;
        }

        return flights;
    }

    public static Flight getRandomFlight(List<Airport> airportList) {

        Flight flight = new Flight();

        flight.setDepartureAirportID(airportList.get(MockApiGenerator.getRandomInteger(15)).getId());
        flight.setArrivalAirportID(airportList.get(MockApiGenerator.getRandomInteger(15)).getId());
        while (flight.getDepartureAirportID() == flight.getArrivalAirportID()) {
            flight.setArrivalAirportID(airportList.get(MockApiGenerator.getRandomInteger(15)).getId());
        }

        flight.setDepartureDate(MockApiGenerator.setRandomDepartureDateWithinNextWeek());
        flight.setReturnDate(MockApiGenerator.setRandomDepartureDateWithinNextWeek());
        while (!flight.getDepartureDate().before(flight.getReturnDate())) {
            flight.setDepartureDate(MockApiGenerator.setRandomDepartureDateWithinNextWeek());
            flight.setReturnDate(MockApiGenerator.setRandomDepartureDateWithinNextWeek());
        }

        flight.setDepartureHour(MockApiGenerator.getRandomTime());
        flight.setReturnHour(MockApiGenerator.getRandomTime());

        flight.setPrice(MockApiGenerator.getRandomPrice(9.99, 99.99));

        return flight;
    }
}
