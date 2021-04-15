package by.jonline.module4.simplest_class_and_object.task5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {
    Counter counter = new Counter();
    Counter counter1;

    @BeforeEach
    void setUp() {
        counter1 = new Counter(0, 100, 0);
    }

    @AfterEach
    void tearDown() {
        counter1.checkTheCurrentState();
    }

    @Test
    void setDefaultSettings() {
        int expected = 50;
        int actual = counter1.setDefaultSettings("Default settings");

        assertEquals(expected, actual);
    }

    @Test
    void increaseCounter() {
        int expected = 15;
        int actual = 0;

        for (int i = 0; i < 15; i++) {
            actual = counter1.increaseCounter();
        }

        assertEquals(expected, actual);
    }

    @Test
    void decreaseCounter() {
        int expected = 49;
        counter1.setDefaultSettings("Default settings");
        int actual = counter1.decreaseCounter();

        assertEquals(expected, actual);
    }
}