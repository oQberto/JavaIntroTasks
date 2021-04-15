package by.jonline.module4.simplest_class_and_object.task10;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AirportServiceTest {
    Airline[] airlines;
    AirportService airportService;
    List<Airline> extendAirlineList;

    @BeforeEach
    void setUp() {
        airlines = new Airline[] {
                new Airline("Moscow", "123A", "Airbus A310", LocalTime.of(14, 25), Day.MONDAY),
                new Airline("Stockholm", "123B", "Airbus A320", LocalTime.of(12, 15), Day.SATURDAY),
                new Airline("Oslo", "123C", "Boeing-737", LocalTime.of(20, 30), Day.MONDAY),
                new Airline("Ottawa", "123D", "Boeing-737", LocalTime.of(15, 45), Day.FRIDAY),
                new Airline("Ottawa", "123AD", "Boeing-767", LocalTime.of(13, 30), Day.THURSDAY),
                new Airline("Ottawa", "123CD", "Airbus A330", LocalTime.of(22, 50), Day.FRIDAY),
                new Airline("Prague", "123AB", "Airbus A310", LocalTime.of(9, 10), Day.TUESDAY),
                new Airline("Helsinki", "134A", "Boeing-737", LocalTime.of(6, 12), Day.SUNDAY),
                new Airline("Paris", "145B", "Airbus A330", LocalTime.of(10, 45), Day.WEDNESDAY),
                new Airline("Athens", "123VD", "Airbus A330", LocalTime.of(13, 50), Day.FRIDAY),
                new Airline("New-York", "123QD", "Airbus A320", LocalTime.of(10, 50), Day.FRIDAY),
                new Airline("Berlin", "123ED", "Airbus A310", LocalTime.of(19, 50), Day.FRIDAY),
        };

        extendAirlineList = new ArrayList<>();
        airportService = new AirportService("Some airport");
        airportService.setAirlines(airlines);
    }

    @Test
    void findFlightsFlayingToAGivenPoint() {
        extendAirlineList.add(airlines[3]);
        extendAirlineList.add(airlines[4]);
        extendAirlineList.add(airlines[5]);

        assertEquals(extendAirlineList, airportService.findFlightsFlayingToAGivenPoint("Ottawa"));
    }

    @Test
    void findFlightsFlayingToAGivenDay() {
        extendAirlineList.add(airlines[0]);
        extendAirlineList.add(airlines[2]);

        assertEquals(extendAirlineList, airportService.findFlightsFlayingToAGivenDay(Day.MONDAY));
    }

    @Test
    void findTheListOfFlightsForTheDayOfWeek() {
        extendAirlineList.add(airlines[3]);
        extendAirlineList.add(airlines[5]);
        extendAirlineList.add(airlines[11]);

        assertEquals(extendAirlineList, airportService.findTheListOfFlightsForTheDayOfWeek(Day.FRIDAY, LocalTime.of(14, 0)));
    }
}