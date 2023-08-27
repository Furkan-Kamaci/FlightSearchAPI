package com.furkankamaci.airport.FlightSearchApi.DataAccess;

import com.furkankamaci.airport.FlightSearchApi.Entity.Airport;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAirportDal extends JpaRepository<Airport, UUID> {

}
