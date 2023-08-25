package com.furkankamaci.airport.FlightSearchApi.Business;

import com.furkankamaci.airport.FlightSearchApi.Entity.Flight;
import com.furkankamaci.airport.FlightSearchApi.Entity.Search;
import com.furkankamaci.airport.FlightSearchApi.Entity.SearchResult;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface ISearchService {
  SearchResult findFlights(Search search);
  SearchResult findOneWayFlights(Search search);
}
