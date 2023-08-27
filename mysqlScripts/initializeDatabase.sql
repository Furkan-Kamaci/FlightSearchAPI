-- drop database if exists airportsystem;
create database airportsystem;
use airportsystem;

-- drop table if EXISTS flights;
DROP TABLE IF EXISTS airports;


CREATE TABLE airports (
    id CHAR(36) PRIMARY KEY,
    airport_code CHAR(3),
    city VARCHAR(255)
);


-- Insert data into Airports Table
INSERT INTO airports (id, airport_code, city) VALUES
    (UUID(), 'JFK', 'New York'),
    (UUID(), 'LAX', 'Los Angeles'),
    (UUID(), 'ORD', 'Chicago'),
    (UUID(), 'DFW', 'Dallas'),
    (UUID(), 'ATL', 'Atlanta'),
    (UUID(), 'DEN', 'Denver'),
    (UUID(), 'SFO', 'San Francisco'),
    (UUID(), 'SEA', 'Seattle'),
    (UUID(), 'MIA', 'Miami'),
    (UUID(), 'PEK', 'Beijing'),
	(UUID(), 'SIN', 'Singapore'),
	(UUID(), 'ICN', 'Seoul'),
	(UUID(), 'IST', 'Istanbul'),
	(UUID(), 'FRA', 'Frankfurt'),
    (UUID(), 'FRA', 'Frankfurt'),
    (UUID(), 'BOS', 'Boston');
    
    
drop table if EXISTS flights;

CREATE TABLE Flights (
    id CHAR(36) PRIMARY KEY,
    departure_airport_id CHAR(36),
    arrival_airport_id CHAR(36),
    departure_date DATE,
    departure_hour TIME,
    return_date DATE,
    return_hour TIME,
    price DOUBLE

);

    