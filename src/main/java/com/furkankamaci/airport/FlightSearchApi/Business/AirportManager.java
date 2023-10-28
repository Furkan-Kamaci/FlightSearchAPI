package com.furkankamaci.airport.FlightSearchApi.Business;

import com.furkankamaci.airport.FlightSearchApi.DataAccess.IAirportDal;
import com.furkankamaci.airport.FlightSearchApi.Entity.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

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
    public void deleteById(UUID id) {
        airportDal.deleteById(id);
    }

    @Override
    public Airport getById(UUID id) {
        return airportDal.findById(id).orElse(null);
    }

    @Override
    public Airport getAirportByCity(String city) {
        List<Airport> airportList = this.findAll();

        for (Airport a : airportList) {
            if (a.getCity().equals(city)) return a;
        }

        return null;
    }

    @Override
    public UUID getIdByCity(String city) {
        List<Airport> airportList = this.findAll();

        for (Airport a : airportList) {
            if (a.getCity().equals(city)) return a.getId();
        }

        return null;
    }

}
