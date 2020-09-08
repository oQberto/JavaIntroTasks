package by.jonline.module2.one_dimensional_array.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayCountTest {

    int[] userArray = new int[]{4, 5, 0, 0, -5, -6, 2, -9, 0, 5};

    @Test
    void countingNegativeNumbersInAnArray() {
        assertEquals(3, ArrayCount.countingNegativeNumbersInAnArray(userArray));
    }

    @Test
    void countingPositiveNumbersInTheArray() {
        assertEquals(4, ArrayCount.countingPositiveNumbersInTheArray(userArray));
    }

    @Test
    void countingZeroesInAnArray() {
        assertEquals(3, ArrayCount.countingZeroesInAnArray(userArray));
    }
}