package by.jonline.module2.one_dimensional_array_sort.task7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlacesToInsertElementsTest {

    @Test
    void specifyWhereToInsertElements() {
        int[] firstArray = new int[]{1, 5, 6, 9, 11, 16};
        int[] secondArray = new int[]{2, 7, 10, 15};

        int[] expected = new int[]{0, 2, 3, 5, 7, 9};

        assertArrayEquals(expected, PlacesToInsertElements.specifyWhereToInsertElements(firstArray, secondArray));
    }
}