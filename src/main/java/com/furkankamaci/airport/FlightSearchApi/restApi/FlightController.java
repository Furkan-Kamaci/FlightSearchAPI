package com.furkankamaci.airport.FlightSearchApi.restApi;

import com.furkankamaci.airport.FlightSearchApi.Business.IFlightService;
import com.furkankamaci.airport.FlightSearchApi.Entity.Flight;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

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

    @PutMapping("/updateFlight")
    public Flight updateFlight(@RequestBody Flight flight) {
        return flightManager.updateFlight(flight);
    }

    @DeleteMapping("/deleteFlightById/{id}")
    public void deleteFlightById(@PathVariable UUID id) {
        flightManager.deleteById(id);
    }

    @GetMapping("/getFlightById/{id}")
    public Flight getFlightById(@PathVariable UUID id) {
        return flightManager.getById(id);
    }

    @GetMapping("")
    public String hello() {
        return "Hello flights..";
    }
}
