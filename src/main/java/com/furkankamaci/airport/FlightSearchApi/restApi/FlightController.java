package com.furkankamaci.airport.FlightSearchApi.restApi;

import com.furkankamaci.airport.FlightSearchApi.Business.IFlightService;
import com.furkankamaci.airport.FlightSearchApi.Entity.Flight;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/api/flights")
public class FlightController {

    private IFlightService flightManager;

    public FlightController(IFlightService flightService) {
        this.flightManager = flightService;
    }

    @GetMapping("/findAll")
    public List<Flight> findAll() {

        CompletableFuture<List<Flight>> futureResult= flightManager.findAll();
        try {
            // Wait for the result of the asynchronous operation
            List<Flight> result = futureResult.get();
            // Now you can work with the result
            return result;
        } catch (InterruptedException | ExecutionException e) {
            // Handle exceptions if necessary
        }
        return null;
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
