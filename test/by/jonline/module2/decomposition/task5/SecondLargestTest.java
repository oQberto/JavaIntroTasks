package by.jonline.module2.decomposition.task5;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondLargestTest {

    @Test
    void findTheSecondLargestNumber() {
        int[] array = new int[]{6, 8, 9, 7, 2, 1, 3, 5, 4};
        int expected = 8;

        assertEquals(expected, SecondLargest.findTheSecondLargestNumber(array));
    }

    @Test
    void sortArray() {
        int[] actual = new int[]{6, 8, 9, 7, 2, 1, 3, 5, 4};
        int[] expected = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};

        assertArrayEquals(expected, SecondLargest.sortArray(actual));
    }
}