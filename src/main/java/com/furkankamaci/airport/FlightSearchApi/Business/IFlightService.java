package com.furkankamaci.airport.FlightSearchApi.Business;

import com.furkankamaci.airport.FlightSearchApi.Entity.Airport;
import com.furkankamaci.airport.FlightSearchApi.Entity.Flight;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IFlightService {

    List<Flight> findAll();

    Flight addFlight(Flight flight);

    Flight updateFlight(Flight flight);

    void deleteById(int id);

    Flight getById(int id);
}
