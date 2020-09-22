package by.jonline.module2.two_dimensional_array.task13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortingColumnsTest {

    @Test
    void bubbleSortInAscending() {
        int[][] expected =
                        {{36, -56, -54},
                         {64, -8, 3},
                         {65, 21, 6}};

        int[][] matrix =
                        {{64, 21, 3},
                         {36, -56, 6},
                         {65, -8, -54}};

        assertArrayEquals(expected, SortingColumns.bubbleSortInAscending(matrix));
    }

    @Test
    void bubbleSortInDescending() {
        int[][] expected =
                        {{65, 21, 6},
                         {64, -8, 3},
                         {36, -56, -54}};

        int[][] matrix =
                        {{64, 21, 3},
                         {36, -56, 6},
                         {65, -8, -54}};

        assertArrayEquals(expected, SortingColumns.bubbleSortInDescending(matrix));

    }
}