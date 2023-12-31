package com.furkankamaci.airport.FlightSearchApi.Business;

import com.furkankamaci.airport.FlightSearchApi.Entity.Search;
import com.furkankamaci.airport.FlightSearchApi.Entity.SearchResult;

public interface ISearchService {
    SearchResult findFlights(Search search);

    SearchResult findOneWayFlights(Search search);
}
