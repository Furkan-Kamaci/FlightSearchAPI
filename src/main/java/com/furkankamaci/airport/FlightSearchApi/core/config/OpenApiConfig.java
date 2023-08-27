package com.furkankamaci.airport.FlightSearchApi.core.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class OpenApiConfig {

    @Value("${furkan.openapi.dev-url}")
    private String devUrl;


    @Bean
    public OpenAPI myOpenAPI() {
        Server devServer = new Server();
        devServer.setUrl(devUrl);
        devServer.setDescription("Server URL in Development environment");


        Contact contact = new Contact();
        contact.setEmail("kamacif@itu.edu.com");
        contact.setName("Furkan KAMACI");


        Info info = new Info()
                .title("Amadeus Flight Search API")
                .version("1.0.0")
                .contact(contact)
                .description("This API exposes endpoints to Flight Search API service.");

        return new OpenAPI().info(info).servers(List.of(devServer));
    }
}