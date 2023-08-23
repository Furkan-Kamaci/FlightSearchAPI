package com.furkankamaci.airport.FlightSearchApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;


@SpringBootApplication
@EnableAsync
public class FlightSearchApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightSearchApiApplication.class, args);
	}

}
