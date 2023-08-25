package com.furkankamaci.airport.FlightSearchApi.Entity;

import java.util.ArrayList;
import java.util.List;

public class SearchResult {


  private List<Flight> departureFlights;
  private List<Flight> returnFlights;

  public SearchResult() {}

  public SearchResult(List<Flight> departureFlights) {
    this.departureFlights = departureFlights;
    this.returnFlights = null;
  }

  public SearchResult(
    List<Flight> departureFlights,
    List<Flight> returnFlights
  ) {
    this.departureFlights = departureFlights;
    this.returnFlights = returnFlights;
  }

  public List<Flight> getDepartureFlights() {
    return departureFlights;
  }

  public List<Flight> getReturnFlights() {
    return returnFlights;
  }

  public void setDepartureFlights(List<Flight> departureFlights) {
    this.departureFlights = departureFlights;
  }

  public void setReturnFlights(List<Flight> returnFlights) {
    this.returnFlights = returnFlights;
  }
}
