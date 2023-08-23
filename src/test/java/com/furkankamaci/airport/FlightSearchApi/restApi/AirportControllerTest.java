//package com.furkankamaci.airport.FlightSearchApi.restApi;
//
//import com.furkankamaci.airport.FlightSearchApi.Business.AirportManager;
//import com.furkankamaci.airport.FlightSearchApi.DataAccess.IAirportDal;
//import com.furkankamaci.airport.FlightSearchApi.Entity.Airport;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import static org.mockito.Mockito.*;
//
//@SpringBootTest
//class AirportControllerTest {
//
//    @MockBean
//    private IAirportDal airportDal;
//
//    private AirportManager airportManager;
//
//    private AirportController airportController;
//
//    @BeforeEach
//    public void setUp() {
//        airportManager = new AirportManager(airportDal);
//        airportController = new AirportController(airportManager);
//
//    }
//
//    @Test
//    public void getAll() {
//        // Arrange
//        List<Airport> mockAirports = new ArrayList<>();
//        mockAirports.add(new Airport("ABC", "CityA"));
//        mockAirports.add(new Airport("DEF", "CityB"));
//        when(airportDal.getAll()).thenReturn(mockAirports);
//
//        // Act
//        List<Airport> result = airportController.getAll();
//
//        // Assert
//        assertEquals(2, result.size());
//        assertEquals("ABC", result.get(0).getAirportCode());
//        assertEquals("CityA", result.get(0).getCity());
//        assertEquals("DEF", result.get(1).getAirportCode());
//        assertEquals("CityB", result.get(1).getCity());
//
//        verify(airportDal, times(1)).getAll();
//    }
//
//
//    @Test
//    void add() {
//        // Arrange
//        Airport newAirport = new Airport("XYZ", "CityX");
//
//        // Act
//        airportController.add(newAirport);
//
//        // Assert
//        verify(airportDal, times(1)).add(newAirport);
//    }
//
//    @Test
//    void update() {
//
//        // Arrange
//        Airport updatedAirport = new Airport("ABC", "UpdatedCity");
////        when(airportDal.update(any(Airport.class))).thenReturn(updatedAirport);
//
//        // Act
//        airportController.update(updatedAirport);
//
//        // Assert
//        verify(airportDal, times(1)).update(updatedAirport);
//    }
//
//    @Test
//    void delete() {
//
//        // Arrange
//        Airport airportToDelete = new Airport("ABC", "CityA");
//
//        // Act
//        airportController.delete(airportToDelete);
//
//        // Assert
//        verify(airportDal, times(1)).delete(airportToDelete);
//    }
//
//    @Test
//    void getByAirportId() {
//
//        // Arrange
//        String airportCode = "ABC";
//        Airport expectedAirport = new Airport(airportCode, "CityA");
//        when(airportDal.getByAirportId(airportCode)).thenReturn(expectedAirport);
//
//        // Act
//        Airport resultAirport = airportController.getByAirportId(airportCode);
//
//        // Assert
//        assertNotNull(resultAirport);
//        assertEquals(airportCode, resultAirport.getAirportCode());
//        assertEquals("CityA", resultAirport.getCity());
//
//        verify(airportDal, times(1)).getByAirportId(airportCode);
//    }
//
//
//}