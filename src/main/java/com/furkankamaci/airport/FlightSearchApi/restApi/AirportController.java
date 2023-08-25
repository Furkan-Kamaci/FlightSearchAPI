package com.furkankamaci.airport.FlightSearchApi.restApi;

import com.furkankamaci.airport.FlightSearchApi.Business.IAirportService;
import com.furkankamaci.airport.FlightSearchApi.Entity.Airport;
import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/airports")
public class AirportController {

  private IAirportService airportManager;

  public AirportController(IAirportService airportService) {
    this.airportManager = airportService;
  }

  @GetMapping("/findAll")
  public List<Airport> findAll() {
    return airportManager.findAll();
  }

  @PostMapping("/addAirport")
  public Airport addAirport(@RequestBody Airport airport) {
    return airportManager.addAirport(airport);
  }

  @PostMapping("/updateAirport")
  public Airport updateAirport(@RequestBody Airport airport) {
    return airportManager.updateAirport(airport);
  }

  @GetMapping("/deleteAirportById/{id}")
  public void deleteAirportById(@PathVariable int id) {
    airportManager.deleteById(id);
  }

  @GetMapping("/getAirportById/{id}")
  public Airport getAirportById(@PathVariable int id) {
    return airportManager.getById(id);
  }

  @GetMapping("")
  public String hello() {
    return "Hello..";
  }
}
