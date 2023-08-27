package com.furkankamaci.airport.FlightSearchApi.core.utils.swaggerUtils.constants;

public class SearchControllerConstants {

    public static final String OPERATION_SEARCH_OBJECT_EXAMPLE_VALUE = "{\n" +
            "    \"departureCity\": \"Dallas\",\n" +
            "    \"arrivalCity\": \"Denver\",\n" +
            "    \"departureDate\": \"2023-08-30\",\n" +  // Comma added here
            "    \"returnDate\": null\n" +
            "}";


    public static final String APIRESPONSE_200_SEARCH_OBJECT_EXAMPLE_VALUE = "{\n" +
            "    \"departureCity\": \"Denver\",\n" +
            "    \"arrivalCity\": \"Dallas\",\n" +
            "    \"departureDate\": \"2023-08-29\",\n" +
            "    \"returnDate\": \"2023-09-03\"\n" +
            "}";

}
