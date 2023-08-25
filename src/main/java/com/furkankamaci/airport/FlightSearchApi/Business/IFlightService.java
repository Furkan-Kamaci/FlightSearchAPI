package com.furkankamaci.airport.FlightSearchApi.Business;

import com.furkankamaci.airport.FlightSearchApi.Entity.Airport;
import com.furkankamaci.airport.FlightSearchApi.Entity.Flight;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import org.springframework.stereotype.Service;

@Service
public interface IFlightService {
  List<Flight> findAll();

  Flight addFlight(Flight flight);

  Flight updateFlight(Flight flight);

  void deleteById(int id);

  Flight getById(int id);
}
