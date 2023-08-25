package com.furkankamaci.airport.FlightSearchApi.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Search {

    private String departureAirportID;
    private String arrivalAirportID;
    private Date departureDate;
    private Date returnDate;

    public void reverse() {
        String temp = this.departureAirportID;
        this.departureAirportID = this.arrivalAirportID;
        this.arrivalAirportID = temp;

        this.departureDate = this.returnDate;
        this.returnDate = null;


    }
}
