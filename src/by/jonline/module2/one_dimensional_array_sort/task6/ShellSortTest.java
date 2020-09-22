package by.jonline.module2.one_dimensional_array_sort.task6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShellSortTest {

    @Test
    void sortTheArrayByShellSort() {
        int[] array = new int[]{4, 5, 9, 7, 6, 1, 3, 2, 8};

        int[] expected = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        assertArrayEquals(expected, ShellSort.sortTheArrayByShellSort(array));
    }
}