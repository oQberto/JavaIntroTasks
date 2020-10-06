package by.jonline.module2.decomposition.task7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfFactorialsTest {

    @Test
    void findSumOfFactorials() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int expected = 368_047;

        assertEquals(expected, SumOfFactorials.findSumOfFactorials(array));
    }
}