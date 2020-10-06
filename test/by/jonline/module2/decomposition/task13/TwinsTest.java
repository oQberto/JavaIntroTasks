package by.jonline.module2.decomposition.task13;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwinsTest {

    @Test
    void findTwinsWhenTheUserEnteredANumberGreaterThen2() {
        int userInput = 8;
        List<Twins> expected = new ArrayList<>();
        expected.add(new Twins(8, 10));
        expected.add(new Twins(9, 11));
        expected.add(new Twins(10, 12));
        expected.add(new Twins(11, 13));
        expected.add(new Twins(12, 14));
        expected.add(new Twins(13, 15));
        expected.add(new Twins(14, 16));

        assertEquals(expected, Twins.findTwins(userInput));
    }

    @Test
    void findTwinsWhenTheUserEnteredANumberLessThen2() {
        int userInput = 1;

        List<Twins> expected = new ArrayList<>();

        assertEquals(expected, Twins.findTwins(userInput));
    }
}