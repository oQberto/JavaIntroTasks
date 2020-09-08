package by.jonline.module2.one_dimensional_array.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfMultipliesTest {

    @Test
    void arrayContainsMultipliesOfTheUserNumber () {
        assertEquals(6, SumOfMultiplies.findTheSumOfMultipliesOfAGivenNumber(new int[]{2, 3 , 4, 9}, 2));
    }

    @Test
    void arrayContainsNoMultipliesOfTheUserNumber () {
        assertEquals(0, SumOfMultiplies.findTheSumOfMultipliesOfAGivenNumber(new int[]{5, 7, 3, 1}, 2));
    }

    @Test
    void allNumbersInTheArrayAreMultipliesOfTheUserNumber () {
        assertEquals(10, SumOfMultiplies.findTheSumOfMultipliesOfAGivenNumber(new int[]{1, 2, 3, 4}, 1));
    }
}