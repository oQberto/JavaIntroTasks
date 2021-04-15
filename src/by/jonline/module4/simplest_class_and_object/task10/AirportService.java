/*
Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.

Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

package by.jonline.module4.simplest_class_and_object.task10;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class AirportService {
    private final String airportName;
    private Airline[] airlines;

    public AirportService(String airportName) {
        this.airportName = airportName;
    }

    public void setAirlines(Airline[] airlines) {
        this.airlines = airlines;
    }

    public List<Airline> findFlightsFlayingToAGivenPoint(String destination) {
        List<Airline> airlineList = new ArrayList<>();
        for (Airline airline : airlines) {
            if (airline.getDestination().equals(destination)) {
                airlineList.add(airline);
            }
        }
        return airlineList;
    }

    public List<Airline> findFlightsFlayingToAGivenDay(Day day) {
        List<Airline> airlineList = new ArrayList<>();
        for (Airline airline : airlines) {
            if (airline.getDay().equals(day)) {
                airlineList.add(airline);
            }
        }
        return airlineList;
    }

    public List<Airline> findTheListOfFlightsForTheDayOfWeek(Day day, LocalTime localTime) {
        List<Airline> airlineList = new ArrayList<>();
        for (Airline airline : airlines) {
            if (airline.getDay().equals(day) && localTime.isBefore(airline.getLocalTime())) {
                airlineList.add(airline);
            }
        }
        return airlineList;
    }
}
