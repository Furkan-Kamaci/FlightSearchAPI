package com.furkankamaci.airport.FlightSearchApi.restApi;

import com.furkankamaci.airport.FlightSearchApi.Business.IFlightService;
import com.furkankamaci.airport.FlightSearchApi.Entity.Flight;
import com.furkankamaci.airport.FlightSearchApi.Entity.Search;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
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

    @Operation(
            summary = "Add Flight endpoint",
//            description = "Add ",
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "",
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = Flight.class),
                            examples = @ExampleObject(value =
                                    "{\n" +
                                            "    \"departureAirportID\": \"b77ff8cd-442b-11ee-83e0-38f3ab9130c3\",\n" +
                                            "    \"arrivalAirportID\": \"b78002fb-442b-11ee-83e0-38f3ab9130c3\",\n" +
                                            "    \"departureDate\": \"2023-09-02\",\n" +
                                            "    \"departureHour\": \"18:30:00\",\n" +
                                            "    \"returnDate\": \"2023-09-05\",\n" +
                                            "    \"returnHour\": \"09:00:00\",\n" +
                                            "    \"price\": 35.50\n" +
                                            "}")
                    )
            )
    )
    @PostMapping("/addFlight")
    public Flight addFlight(@RequestBody Flight flight) {
        return flightManager.addFlight(flight);
    }


    @Operation(
            summary = "Update Flight endpoint",
//            description = "Add ",
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "",
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = Flight.class),
                            examples = @ExampleObject(value =
                                    "{\n" +
                                            "    \"id\": \"049daa23-1860-4f74-aec5-4472a06f73b4\",\n" +
                                            "    \"departureAirportID\": \"b77ff8cd-442b-11ee-83e0-38f3ab9130c3\",\n" +
                                            "    \"arrivalAirportID\": \"b78002fb-442b-11ee-83e0-38f3ab9130c3\",\n" +
                                            "    \"departureDate\": \"2023-09-02\",\n" +
                                            "    \"departureHour\": \"18:30:00\",\n" +
                                            "    \"returnDate\": \"2023-09-05\",\n" +
                                            "    \"returnHour\": \"09:00:00\",\n" +
                                            "    \"price\": 35.50\n" +
                                            "}")

                    )
            )
    )
    @PutMapping("/updateFlight")
    public Flight updateFlight(@RequestBody Flight flight) {
        return flightManager.updateFlight(flight);
    }


    @DeleteMapping("/deleteFlightById/{id}")
    public void deleteFlightById(@Parameter(description = "id of an Airport to be updated. Get an existing id via findAll endpoint.",
            example = "0f8f4cad-97f7-46f2-8bb8-897f17dacefb") @PathVariable UUID id) {
        flightManager.deleteById(id);
    }


    @GetMapping("/getFlightById/{id}")
    public Flight getFlightById(@Parameter(description = "id of a Flight to be get.",
            example = "0f8f4cad-97f7-46f2-8bb8-897f17dacefb") @PathVariable UUID id) {
        return flightManager.getById(id);
    }


    @Operation(
            summary = "isAvailable Check")
    @GetMapping("")
    public String availableCheck() {
        return "Flight API is available";
    }
}
