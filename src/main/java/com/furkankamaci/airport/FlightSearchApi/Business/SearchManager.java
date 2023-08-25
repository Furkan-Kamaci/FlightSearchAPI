package com.furkankamaci.airport.FlightSearchApi.Business;


import com.furkankamaci.airport.FlightSearchApi.DataAccess.IFlightDal;
import com.furkankamaci.airport.FlightSearchApi.Entity.Flight;
import com.furkankamaci.airport.FlightSearchApi.Entity.Search;
import com.furkankamaci.airport.FlightSearchApi.Entity.SearchResult;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchManager implements ISearchService {


  @Autowired
  private IFlightDal flightDal;

  @Override
  public SearchResult findFlights(Search search) {
    if (search.getReturnDate() == null) {
      return this.findOneWayFlights(search);
    }

    SearchResult result = new SearchResult();
    result.setDepartureFlights(
      this.findOneWayFlights(search).getDepartureFlights()
    );
    System.out.println(search);
    search.reverse();
    System.out.println(search);

    result.setReturnFlights(
      this.findOneWayFlights(search).getDepartureFlights()
    );

    return result;
  }

  @Override
  public SearchResult findOneWayFlights(Search search) {
    List<Flight> result = new ArrayList<>();
    List<Flight> allFlight = flightDal.findAll();

    for (Flight flight : allFlight) {
      if (
        flight.getDepartureAirportID().equals(search.getDepartureAirportID()) &&
        flight.getArrivalAirportID().equals(search.getArrivalAirportID()) &&
        flight
          .getDepartureDate()
          .toString()
          .equals(search.getDepartureDate().toString())
      ) {
        System.out.println(flight.toString());
        result.add(flight);
      }
    }
    System.out.println(result.toString());

    return new SearchResult(result);
  }
}
