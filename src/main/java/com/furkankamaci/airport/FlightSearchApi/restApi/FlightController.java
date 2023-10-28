package com.furkankamaci.airport.FlightSearchApi.restApi;

import com.furkankamaci.airport.FlightSearchApi.Business.IFlightService;
import com.furkankamaci.airport.FlightSearchApi.Entity.Flight;
import com.furkankamaci.airport.FlightSearchApi.core.utils.swaggerUtils.constants.FlightControllerConstants;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@CrossOrigin
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
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "",
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = Flight.class),
                            examples = @ExampleObject(value = FlightControllerConstants.ADD_FLIGHT_OBJECT_EXAMPLE_VALUE)
                    )
            )
    )
    @PostMapping("/addFlight")
    public Flight addFlight(@RequestBody Flight flight) {
        return flightManager.addFlight(flight);
    }

    @Operation(
            summary = "Update Flight endpoint",
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "",
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = Flight.class),
                            examples = @ExampleObject(value = FlightControllerConstants.UPDATE_FLIGHT_OBJECT_EXAMPLE_VALUE)

                    )
            )
    )
    @PutMapping("/updateFlight")
    public Flight updateFlight(@RequestBody Flight flight) {
        return flightManager.updateFlight(flight);
    }


    @DeleteMapping("/deleteFlightById/{id}")
    public void deleteFlightById(@Parameter(description = "id of an Airport to be deleted. Get an existing id via findAll endpoint.",
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
