package by.jonline.module2.decomposition.task15;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IncreasingSequenceTest {

    @Test
    void findNumbersInWhichTheNumbersAreAscending() {
        List<Integer> expected = new ArrayList<>();
        expected.add(123);
        expected.add(234);
        expected.add(345);
        expected.add(456);
        expected.add(567);
        expected.add(678);
        expected.add(789);

        int userInput = 3;

        assertEquals(expected, IncreasingSequence.findNumbersInWhichTheNumbersAreAscending(userInput));
    }
}