package by.jonline.module4.simplest_class_and_object.task6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ClockTest {

    Clock clock;

    @BeforeEach
    void setUp() {
        clock = new Clock();
        clock.setTime(2, 10, 20);
    }

    @Test
    void setTime() {
        clock.setTime(1, 45, 21);
        String expected = "01 : 45 : 21";

        assertEquals(expected, clock.toString());
    }

    @Test
    void addHours() {
        clock.addHours(4);
        String expected = "06 : 10 : 20";
        assertEquals(expected, clock.toString());

        clock.addHours(19);
        String expected1 = "01 : 10 : 20";
        assertEquals(expected1, clock.toString());
    }

    @Test
    void addMinutes() {
        clock.addMinutes(15);
        String expected = "02 : 25 : 20";
        assertEquals(expected, clock.toString());

        clock.addMinutes(120);
        String expected1 = "04 : 25 : 20";
        assertEquals(expected1, clock.toString());
    }

    @Test
    void addSeconds() {
        clock.addSeconds(15);
        String expected = "02 : 10 : 35";
        assertEquals(expected, clock.toString());

        clock.addSeconds(3600);
        String expected1 = "03 : 10 : 35";
        assertEquals(expected1, clock.toString());
    }

    @Test
    void setHours() {
        clock.setHours(5);
        String expected = "05 : 10 : 20";
        assertEquals(expected, clock.toString());
    }

    @Test
    void setMinutes() {
        clock.setMinutes(5);
        String expected = "02 : 05 : 20";
        assertEquals(expected, clock.toString());
    }

    @Test
    void setSeconds() {
        clock.setSeconds(1);
        String expected = "02 : 10 : 01";
        assertEquals(expected, clock.toString());
    }
}