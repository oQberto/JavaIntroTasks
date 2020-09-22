package by.jonline.module2.one_dimensional_array_sort.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    @Test
    void sortTheArray() {
        int[] arr = new int[]{1, 5, 6, 8, 4, 5, 2, 3};

        int[] expected = new int[]{8, 6, 5, 5, 4, 3, 2, 1};
        assertArrayEquals(expected, SelectionSort.sortTheArray(arr));
    }
}