package com.furkankamaci.airport.FlightSearchApi.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Time;

@Entity
@Data
@Table(name = "flights")
@NoArgsConstructor
@AllArgsConstructor
public class Flight {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "departure_airport_id")
    private String departureAirportID;

    @Column(name = "arrival_airport_id")
    private String arrivalAirportID;

    @Column(name = "departure_date")
    private Date departureDate;

    @Column(name = "departure_hour")
    private Time departureHour;

    @Column(name = "return_date")
    private Date returnDate;

    @Column(name = "return_hour")
    private Time returnHour;

    @Column(name = "price")
    private Double price;

}
