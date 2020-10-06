package by.jonline.module2.decomposition.task8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumOfArrayElementsTest {

    int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

    @Test
    void sumOfTheFirstThreeElements() {
        int expected = 6;

        assertEquals(expected, SumOfArrayElements.selectThreeConsecutiveElements(array, 0, 2));
    }

    @Test
    void sumOfMiddleThreeElements() {
        int expected = 15;

        assertEquals(expected, SumOfArrayElements.selectThreeConsecutiveElements(array, 3, 5));
    }

    @Test
    void sumOfTheLastThreeElements() {
        int expected = 24;

        assertEquals(expected, SumOfArrayElements.selectThreeConsecutiveElements(array, 6, 8));
    }

}