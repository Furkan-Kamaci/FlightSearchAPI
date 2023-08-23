package com.furkankamaci.airport.FlightSearchApi.Business;

import com.furkankamaci.airport.FlightSearchApi.Entity.Flight;
import com.furkankamaci.airport.FlightSearchApi.Entity.Search;
import com.furkankamaci.airport.FlightSearchApi.Entity.SearchResult;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface  ISearchService {

    SearchResult findFlights(Search search);
    SearchResult findOneWayFlights(Search search);
    SearchResult findTwoWayFlights(Search search);
}
