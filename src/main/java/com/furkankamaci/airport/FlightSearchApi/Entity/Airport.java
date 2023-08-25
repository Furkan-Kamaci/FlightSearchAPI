package com.furkankamaci.airport.FlightSearchApi.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@Table(name = "airports")
@NoArgsConstructor
@AllArgsConstructor
public class Airport {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "airport_code")
    private String airportCode;

    @Column(name = "city")
    private String city;
    //
    //
    //    public Airport(String airportCode, String city) {
    //        this.airportCode = airportCode;
    //        this.city = city;
    //    }
    //    public Airport() {}
    //
    //    public String getAirportCode() {
    //        return airportCode;
    //    }
    //
    //    public void setAirportCode(String airportCode) {
    //        this.airportCode = airportCode;
    //    }
    //
    //    public String getCity() {
    //        return city;
    //    }
    //
    //    public void setCity(String city) {
    //        this.city = city;
    //    }
}
