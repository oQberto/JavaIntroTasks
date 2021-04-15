package by.jonline.module4.simplest_class_and_object.task4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class TrainLogicTest {
    private final TrainService tr = new TrainService();
    private final Train[] trains = new Train[5];
    private final Train[] extendsTrains = new Train[5];

    @BeforeEach
    void setUp() {
        trains[0] = new Train("Minsk", 3, LocalTime.of(8, 15));
        trains[1] = new Train("Minsk", 5, LocalTime.of(9, 24));
        trains[2] = new Train("Rome", 4, LocalTime.of(6,35));
        trains[3] = new Train("Berlin", 1, LocalTime.of(19, 54));
        trains[4] = new Train("Paris", 2, LocalTime.of(17,17));
    }

    @AfterEach
    void tearDown() {
        for (Train train : trains) {
            System.out.println("Поезд " + train.getTrainNumber() + " прибывает в " + train.getDestination() + " в " + train.getDepartureTime());
        }
    }

    @Test
    void sortingByNumbers() {
        extendsTrains[0] = new Train("Berlin", 1, LocalTime.of(19, 54));
        extendsTrains[1] = new Train("Paris", 2, LocalTime.of(17,17));
        extendsTrains[2] = new Train("Minsk", 3, LocalTime.of(8, 15));
        extendsTrains[3] = new Train("Rome", 4, LocalTime.of(6,35));
        extendsTrains[4] = new Train("Minsk", 5, LocalTime.of(9, 24));

        assertArrayEquals(extendsTrains, tr.sortingByNumbers(trains));
    }

    @Test
    void outputOfInformationAboutTrain() {
        int userInput = 4;
        String expected = "Поезд 4 прибывает в Rome в 06:35";

        assertEquals(expected, tr.outputOfInformationAboutTrain(trains, userInput));
    }

    @Test
    void sortingByDestination() {
        extendsTrains[0] = new Train("Berlin", 1, LocalTime.of(19, 54));
        extendsTrains[1] = new Train("Minsk", 3, LocalTime.of(8, 15));
        extendsTrains[2] = new Train("Minsk", 5, LocalTime.of(9, 24));
        extendsTrains[3] = new Train("Paris", 2, LocalTime.of(17,17));
        extendsTrains[4] = new Train("Rome", 4, LocalTime.of(6,35));

        assertArrayEquals(extendsTrains, tr.sortingByDestination(trains));
    }
}