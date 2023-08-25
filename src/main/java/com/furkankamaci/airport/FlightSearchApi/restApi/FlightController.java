package com.furkankamaci.airport.FlightSearchApi.restApi;

import com.furkankamaci.airport.FlightSearchApi.Business.IFlightService;
import com.furkankamaci.airport.FlightSearchApi.Entity.Flight;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/flights")
public class FlightController {

    private final IFlightService flightManager;

    public FlightController(IFlightService flightService) {
        this.flightManager = flightService;
    }

    @GetMapping("/findAll")
    public List<Flight> findAll() {
        return flightManager.findAll();
    }

    @PostMapping("/addFlight")
    public Flight addFlight(@RequestBody Flight flight) {
        return flightManager.addFlight(flight);
    }

    @PostMapping("/updateFlight")
    public Flight updateFlight(@RequestBody Flight flight) {
        return flightManager.updateFlight(flight);
    }

    @GetMapping("/deleteFlightById/{id}")
    public void deleteFlightById(@PathVariable int id) {
        flightManager.deleteById(id);
    }

    @GetMapping("/getFlightById/{id}")
    public Flight getFlightById(@PathVariable int id) {
        return flightManager.getById(id);
    }

    @GetMapping("")
    public String hello() {
        return "Hello flights..";
    }
}
