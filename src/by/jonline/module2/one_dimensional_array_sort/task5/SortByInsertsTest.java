package by.jonline.module2.one_dimensional_array_sort.task5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortByInsertsTest {

    @Test
    void sortTheArrayByInserts() {
        int[] array = new int[]{4, 5, 6, 8, 9, 1, 3, 2, 7};

        int[] expected = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        assertArrayEquals(expected, SortByInserts.sortTheArrayByInserts(array));
    }
}