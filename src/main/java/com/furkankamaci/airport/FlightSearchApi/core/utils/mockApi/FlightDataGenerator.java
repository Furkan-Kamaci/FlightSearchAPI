package com.furkankamaci.airport.FlightSearchApi.core.utils.mockApi;

import com.furkankamaci.airport.FlightSearchApi.Entity.Flight;
import com.furkankamaci.airport.FlightSearchApi.core.utils.random.GetRandomInteger;
import com.furkankamaci.airport.FlightSearchApi.core.utils.random.RandomDate;
import com.furkankamaci.airport.FlightSearchApi.core.utils.random.RandomPrice;
import com.furkankamaci.airport.FlightSearchApi.core.utils.random.RandomTime;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class FlightDataGenerator {



    public static List<Flight> getRandomFlights(){


        List<Flight> flights = new ArrayList<>();

//        flights.add(new)

        return  flights;
    }

    public static Flight getRandomFlight(){
        ArrayList<String> airportCodes = new ArrayList<>();

        {

            airportCodes.add("LAX");
            airportCodes.add("JFK");
            airportCodes.add("LHR");
            airportCodes.add("CDG");
            airportCodes.add("DXB");
            airportCodes.add("ATL");
            airportCodes.add("ORD");
            airportCodes.add("PEK");
            airportCodes.add("SIN");
            airportCodes.add("ICN");
            airportCodes.add("AMS");
            airportCodes.add("FRA");
            airportCodes.add("HND");
            airportCodes.add("DFW");
            airportCodes.add("DEN");
            airportCodes.add("SYD");
            airportCodes.add("MIA");
            airportCodes.add("CAN");
            airportCodes.add("IST");
            airportCodes.add("MEX");
        }
        Flight flight = new Flight();


        flight.setDepartureAirportID(airportCodes.get(GetRandomInteger.getRandomInteger(19)));
        flight.setArrivalAirportID(airportCodes.get(GetRandomInteger.getRandomInteger(20)));
        while(flight.getDepartureAirportID()==flight.getArrivalAirportID()){
            flight.setArrivalAirportID(airportCodes.get(GetRandomInteger.getRandomInteger(20)));
        }

        flight.setDepartureDate( RandomDate.setRandomDepartureDateWithinNextWeek());
        flight.setReturnDate( RandomDate.setRandomDepartureDateWithinNextWeek());
        while(!flight.getDepartureDate().before(flight.getReturnDate())){
            flight.setReturnDate( RandomDate.setRandomDepartureDateWithinNextWeek());
        }

        flight.setDepartureHour(RandomTime.randomTime());
        flight.setReturnHour(RandomTime.randomTime());

        flight.setPrice(RandomPrice.getRandomPrice(9.99,99.99));

        System.out.println(flight);

        return flight;
    }
}
