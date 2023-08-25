package com.furkankamaci.airport.FlightSearchApi.Business;

import com.furkankamaci.airport.FlightSearchApi.Entity.Airport;
import java.util.List;

public interface IAirportService {
  List<Airport> findAll();

  Airport addAirport(Airport airport);

  Airport updateAirport(Airport airport);

  void deleteById(int id);

  Airport getById(int id);
}
