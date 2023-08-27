package com.furkankamaci.airport.FlightSearchApi.Entity;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.*;
import org.hibernate.type.SqlTypes;

import java.util.UUID;

@Entity
@Data
@Table(name = "airports")
@NoArgsConstructor
@AllArgsConstructor
public class Airport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    @Column(name = "id", columnDefinition = "CHAR(36)")
    private UUID id;

    @Column(name = "airport_code")
    private String airportCode;

    @Column(name = "city")
    private String city;

}
