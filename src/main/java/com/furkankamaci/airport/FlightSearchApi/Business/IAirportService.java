package com.furkankamaci.airport.FlightSearchApi.Business;

import com.furkankamaci.airport.FlightSearchApi.Entity.Airport;
import java.util.List;
import java.util.UUID;

public interface IAirportService {
  List<Airport> findAll();

  Airport addAirport(Airport airport);

  Airport updateAirport(Airport airport);

  void deleteById(UUID id);

  Airport getById(UUID id);
}
