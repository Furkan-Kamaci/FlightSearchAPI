package com.furkankamaci.airport.FlightSearchApi.Business;

import com.furkankamaci.airport.FlightSearchApi.DataAccess.IFlightDal;
import com.furkankamaci.airport.FlightSearchApi.Entity.Flight;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class FlightManager implements IFlightService {

    @Autowired
    private IFlightDal flightDal;

    @Override
    public List<Flight> findAll() {
        return flightDal.findAll();
    }

    @Override
    public Flight addFlight(Flight flight) {
        return flightDal.save(flight);
    }

    @Override
    public Flight updateFlight(Flight flight) {
        return flightDal.save(flight);
    }

    @Override
    public void deleteById(UUID id) {
        flightDal.deleteById(id);
    }

    @Override
    public Flight getById(UUID id) {
        return flightDal.findById(id).orElse(null);
    }
}
