package com.furkankamaci.airport.FlightSearchApi.Business;

import com.furkankamaci.airport.FlightSearchApi.DataAccess.IAirportDal;
import com.furkankamaci.airport.FlightSearchApi.Entity.Airport;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AirportManager implements IAirportService {

  @Autowired
  private IAirportDal airportDal;

  @Override
  public List<Airport> findAll() {
    return airportDal.findAll();
  }

  @Override
  public Airport addAirport(Airport airport) {
    return airportDal.save(airport);
  }

  @Override
  public Airport updateAirport(Airport airport) {
    return airportDal.save(airport);
  }

  @Override
  public void deleteById(int id) {
    airportDal.deleteById(id);
  }

  @Override
  public Airport getById(int id) {
    return airportDal.findById(id).orElse(null);
  }
}
