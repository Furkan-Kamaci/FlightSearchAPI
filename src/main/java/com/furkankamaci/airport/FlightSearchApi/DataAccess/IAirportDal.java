package com.furkankamaci.airport.FlightSearchApi.DataAccess;

import com.furkankamaci.airport.FlightSearchApi.Entity.Airport;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAirportDal extends JpaRepository<Airport, Integer> {
  //    List<Airport> getAll();
  //
  //    void add(Airport airport);
  //
  //    void update(Airport airport);
  //
  //    void delete(Airport airport);
  //
  //    Airport getByAirportId(String airportCode);
}
