package com.furkankamaci.airport.FlightSearchApi.DataAccess;

import com.furkankamaci.airport.FlightSearchApi.Entity.Airport;
import com.furkankamaci.airport.FlightSearchApi.Entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IFlightDal extends JpaRepository<Flight, Integer> {}
