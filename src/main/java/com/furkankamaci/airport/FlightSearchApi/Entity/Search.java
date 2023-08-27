package com.furkankamaci.airport.FlightSearchApi.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Search {

    private String departureCity;
    private String arrivalCity;
    private Date departureDate;
    private Date returnDate;

    public void reverse() {
        String temp = this.departureCity;
        this.departureCity = this.arrivalCity;
        this.arrivalCity = temp;

        this.departureDate = this.returnDate;
        this.returnDate = null;

    }
}
