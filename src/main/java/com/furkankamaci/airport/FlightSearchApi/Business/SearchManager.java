package com.furkankamaci.airport.FlightSearchApi.Business;


import com.furkankamaci.airport.FlightSearchApi.DataAccess.IFlightDal;
import com.furkankamaci.airport.FlightSearchApi.Entity.Flight;
import com.furkankamaci.airport.FlightSearchApi.Entity.Search;
import com.furkankamaci.airport.FlightSearchApi.Entity.SearchResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchManager implements ISearchService {

    @Autowired
    private IFlightDal flightDal;


    @Override
    public SearchResult findFlights(Search search) {
    }

    @Override
    public SearchResult findOneWayFlights(Search search) {


    }

    @Override
    public SearchResult findTwoWayFlights(Search search) {
        return null;
    }
}
