package com.furkankamaci.airport.FlightSearchApi.restApi;

import com.furkankamaci.airport.FlightSearchApi.Business.IAirportService;
import com.furkankamaci.airport.FlightSearchApi.Entity.Airport;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/airports")
public class AirportController {

    private final IAirportService airportManager;

    public AirportController(IAirportService airportService) {
        this.airportManager = airportService;
    }

    @GetMapping("/findAll")
    public List<Airport> findAll() {
        return airportManager.findAll();
    }

    @Operation(
            summary = "Add Airport endpoint",
//            description = "Add ",
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "This is the request body",
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = Airport.class),
                            examples = @ExampleObject(value =
                                    "{\n" +
                                            "    \"airportCode\": \"ABC\",\n" +
                                            "    \"city\": \"new city\"\n" +
                                            "}")

                    )
            )
    )
    @PostMapping("/addAirport")
    public Airport addAirport(@RequestBody Airport airport) {
        return airportManager.addAirport(airport);
    }

    @Operation(
            summary = "Update Airport endpoint",
//            description = "Add ",
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "id of a Flight to be deleted. Get an existing id via findAll endpoint",
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = Airport.class),
                            examples = @ExampleObject(value =
                                    "{\n" +
                                            "    \"id\": \"2cea429a-bc86-4105-adbb-0d3c3271fc41\",\n" +
                                            "    \"airportCode\": \"NEW\",\n" +
                                            "    \"city\": \"new new city\"\n" +
                                            "}")

                    )
            )
    )
    @PutMapping("/updateAirport")
    public Airport updateAirport(@RequestBody Airport airport) {
        return airportManager.updateAirport(airport);
    }

    @DeleteMapping("/deleteAirportById/{id}")
    public void deleteAirportById(@Parameter(description = "id of an Airport to be deleted. Get an existing id via findAll endpoint.",
            example = "8a404441-de69-4628-9685-38fcc386a89a") @PathVariable UUID id) {
        airportManager.deleteById(id);
    }

    @GetMapping("/getAirportById/{id}")
    public Airport getAirportById(@Parameter(description = "id of an Airport to be get",
            example = "b7800334-442b-11ee-83e0-38f3ab9130c3") @PathVariable UUID id) {
        System.out.println(id);
        return airportManager.getById(id);
    }

    @Operation(
            summary = "isAvailable Check")
    @GetMapping("")
    public String availableCheck() {
        return "Airport API is available";
    }
}
