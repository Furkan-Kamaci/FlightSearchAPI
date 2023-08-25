package com.furkankamaci.airport.FlightSearchApi.Business.scheduledJobs;

import com.furkankamaci.airport.FlightSearchApi.Business.IFlightService;
import com.furkankamaci.airport.FlightSearchApi.DataAccess.IFlightDal;
import com.furkankamaci.airport.FlightSearchApi.Entity.Flight;
import com.furkankamaci.airport.FlightSearchApi.restApi.MockFlightController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FlightDataUpdater {

    @Autowired
    MockFlightController mockFlightController ;

    @Autowired
    IFlightService flightService;

    //    @Scheduled(cron= "0 0 0 * * *") // hergun gece yarisinda
    @Scheduled(cron= "*/5 * * * * *") // her saniye
    public void updateFlightData(){

        System.out.println("updateFlightData guncelleniyor");

      List<Flight> newData= mockFlightController.getMockFlightInfo();
      for(Flight f : newData){
          flightService.addFlight(f);
      }
    }
}
