package com.furkankamaci.airport.FlightSearchApi.Business;

import com.furkankamaci.airport.FlightSearchApi.Entity.Flight;
import com.furkankamaci.airport.FlightSearchApi.Entity.Search;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface  ISearchService {

    List<Flight> findFlights(Search search);
    List<Flight> findOneWayFlights(Search search);
}
