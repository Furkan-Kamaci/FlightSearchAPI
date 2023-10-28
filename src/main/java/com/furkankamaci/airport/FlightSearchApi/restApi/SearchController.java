package com.furkankamaci.airport.FlightSearchApi.restApi;

import com.furkankamaci.airport.FlightSearchApi.Business.ISearchService;
import com.furkankamaci.airport.FlightSearchApi.Entity.Search;
import com.furkankamaci.airport.FlightSearchApi.Entity.SearchResult;
import com.furkankamaci.airport.FlightSearchApi.core.utils.swaggerUtils.constants.SearchControllerConstants;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
@RequestMapping("/api/search")
public class SearchController {

    @Autowired
    private ISearchService searchService;

    @Operation(
            summary = "Search endpoint",
            description = "Retrieves a suitable flight based on the provided parameters. For return Flight informations include returnDate as well",
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "",
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = Search.class),
                            examples = @ExampleObject(value = SearchControllerConstants.OPERATION_SEARCH_OBJECT_EXAMPLE_VALUE
                            )

                    )
            )
    )
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = {@Content(schema = @Schema(implementation = SearchController.class),
                    mediaType = "application/json",
                    examples = @ExampleObject(value = SearchControllerConstants.APIRESPONSE_200_SEARCH_OBJECT_EXAMPLE_VALUE)

            )}),
            @ApiResponse(responseCode = "404", content = {@Content(schema = @Schema())}),
            @ApiResponse(responseCode = "500", content = {@Content(schema = @Schema())})})

    @PostMapping("")
    public SearchResult findFlights(@RequestBody Search search) {
        return searchService.findFlights(search);
    }
}
