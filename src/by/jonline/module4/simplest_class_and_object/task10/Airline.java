/*
Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.

Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.

Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

package by.jonline.module4.simplest_class_and_object.task10;

import java.time.*;

public class Airline {
    private String destination;
    private String flightNumber;
    private String aircraftType;
    private LocalTime localTime;
    private LocalDate localDate;
    private Day day;

    public Airline(String destination, String flightNumber, String aircraftType, LocalTime localTime, LocalDate localDate, Day day) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.aircraftType = aircraftType;
        this.localTime = localTime;
        this.localDate = localDate;
        this.day = day;
    }

    public Airline(String destination, String flightNumber, String aircraftType, LocalTime localTime, Day day) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.aircraftType = aircraftType;
        this.localTime = localTime;
        this.day = day;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public void setLocalTime(LocalTime localTime) {
        this.localTime = localTime;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public String getDestination() {
        return destination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public Day getDay() {
        return day;
    }

    @Override
    public String toString() {
        return "Airline{" + '\n' +
                "destination='" + destination + '\n' +
                "flightNumber='" + flightNumber + '\n' +
                "aircraftType='" + aircraftType + '\n' +
                "localTime=" + localTime +
                "localDate=" + localDate +
                "day=" + day +
                '}';
    }
}
