package com.furkankamaci.airport.FlightSearchApi.Business;


import com.furkankamaci.airport.FlightSearchApi.DataAccess.IFlightDal;
import com.furkankamaci.airport.FlightSearchApi.Entity.Flight;
import com.furkankamaci.airport.FlightSearchApi.Entity.Search;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchManager implements ISearchService {

    @Autowired
    private IFlightDal flightDal;


    @Override
    public List<Flight> findFlights(Search search) {
        return this.findOneWayFlights(search);
    }

    @Override
    public List<Flight> findOneWayFlights(Search search) {
        List<Flight> result = new ArrayList<>();
        List<Flight> allFlight = flightDal.findAll();
        System.out.println(allFlight.toString());
        System.out.println(search.getDepartureAirportID());
        System.out.println(allFlight.get(0).getDepartureAirportID());
        System.out.println(allFlight.get(0).getDepartureAirportID().equals(search.getDepartureAirportID()));

        for(Flight flight : allFlight){
            if(flight.getDepartureAirportID().equals(search.getDepartureAirportID())
////            flight.getArrivalAirportID() == search.getArrivalAirportID()&&
////            flight.getDepartureDate() == search.getDepartureDate()
            ){
                System.out.println(flight.toString());
                result.add(flight);

            }
        }
        System.out.println(result.toString());

        return result;
    }
}
