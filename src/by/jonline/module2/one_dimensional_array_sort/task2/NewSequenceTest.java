package by.jonline.module2.one_dimensional_array_sort.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NewSequenceTest {

    @Test
    void fromTwoSequenceIntoAThird() {
        int[] firstArray = new int[]{3, 2, 1};
        int[] secondArray = new int[]{3, 1, 3};

        int[] expected = new int[]{1, 1, 2, 3, 3, 3};

        assertArrayEquals(expected, NewSequence.fromTwoSequenceIntoAThird(firstArray, secondArray));
    }
}