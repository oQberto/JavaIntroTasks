package by.jonline.module2.one_dimensional_array_sort.task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortingExchangesTest {

    @Test
    void sortTheArrayWithExchanges() {
        int[] array = new int[]{5, 1, 7, 2, 4, 3};

        int[] expected = new int[]{1, 2, 3, 4, 5, 7};

        assertArrayEquals(expected, SortingExchanges.sortTheArrayWithExchanges(array));
    }
}