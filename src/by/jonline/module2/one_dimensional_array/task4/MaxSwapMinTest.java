package by.jonline.module2.one_dimensional_array.task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxSwapMinTest {
    int[] userArray = new int[]{1, 5, 7, -12, -23, 0, 4, 32};

    @Test
    void swapElements() {
        assertEquals("[1, 5, 7, -12, 32, 0, 4, -23]", MaxSwapMin.swapElements(userArray));
    }
}