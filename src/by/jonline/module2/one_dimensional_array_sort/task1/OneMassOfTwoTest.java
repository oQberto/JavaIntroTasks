package by.jonline.module2.one_dimensional_array_sort.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OneMassOfTwoTest {

    @Test
    void creatingOneArrayOfTwo() {
        int[] firstArray = new int[]{1, 2, 3, 4, 5, 6};
        int[] secondArray = new int[]{7, 8, 9, 0};
        int k = 3;

        int[] expected = new int[]{1, 2, 3, 7, 8, 9, 0, 4, 5, 6};

        assertArrayEquals(expected, OneMassOfTwo.creatingOneArrayOfTwo(firstArray, secondArray, k));
    }
}