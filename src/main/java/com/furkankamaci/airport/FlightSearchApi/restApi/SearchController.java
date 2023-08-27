package com.furkankamaci.airport.FlightSearchApi.restApi;

import com.furkankamaci.airport.FlightSearchApi.Business.ISearchService;
import com.furkankamaci.airport.FlightSearchApi.Entity.Search;
import com.furkankamaci.airport.FlightSearchApi.Entity.SearchResult;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/search")
public class SearchController {

    @Autowired
    private ISearchService searchService;

    @Operation(
            summary = "Search endpoint",
            description = "Retrieves a suitable flight based on the provided parameters. For return Flight informations include returnDate as well",
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "This is the request body",
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = Search.class),
                            examples = @ExampleObject(value =
                                    "{\n" +
                                            "    \"departureCity\": \"Dallas\",\n" +
                                            "    \"arrivalCity\": \"Denver\",\n" +
                                            "    \"departureDate\": \"2023-08-30\",\n" +  // Comma added here
                                            "    \"returnDate\": null\n" +
                                            "}")

                    )
            )
    )
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = {@Content(schema = @Schema(implementation = SearchController.class),
                    mediaType = "application/json",
                    examples = @ExampleObject(value =
                            "{\n" +
                                    "    \"departureCity\": \"Denver\",\n" +
                                    "    \"arrivalCity\": \"Dallas\",\n" +
                                    "    \"departureDate\": \"2023-08-29\",\n" +
                                    "    \"returnDate\": \"2023-09-03\"\n" +
                                    "}")

            )}),
            @ApiResponse(responseCode = "404", content = {@Content(schema = @Schema())}),
            @ApiResponse(responseCode = "500", content = {@Content(schema = @Schema())})})

    @PostMapping("")
    public SearchResult findOneWayFlights(@RequestBody Search search) {
        return searchService.findFlights(search);
    }
}
