package com.furkankamaci.airport.FlightSearchApi.Business;

import com.furkankamaci.airport.FlightSearchApi.DataAccess.IFlightDal;
import com.furkankamaci.airport.FlightSearchApi.Entity.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
public class FlightManager implements IFlightService {

    @Autowired
    private IFlightDal flightDal;

    @Async
    @Override
    public CompletableFuture<List<Flight>> findAll() {
        return (CompletableFuture<List<Flight>>) flightDal.findAll();
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
    public void deleteById(int id) {
        flightDal.deleteById(id);

    }

    @Override
    public Flight getById(int id) {
        return flightDal.findById(id).orElse(null);
    }
}
