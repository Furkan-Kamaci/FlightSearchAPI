package com.furkankamaci.airport.FlightSearchApi.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.sql.Date;
import java.sql.Time;
import java.util.UUID;

@Entity
@Data
@Table(name = "flights")
@NoArgsConstructor
@AllArgsConstructor
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    @Column(name = "id", columnDefinition = "CHAR(36)")
    private UUID id;

    @Column(name = "departure_airport_id")
    private UUID departureAirportID;

    @Column(name = "arrival_airport_id")
    private UUID arrivalAirportID;

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
