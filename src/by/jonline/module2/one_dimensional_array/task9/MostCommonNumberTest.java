package by.jonline.module2.one_dimensional_array.task9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MostCommonNumberTest {

    @Test
    void findMostCommonNumber() {
        assertEquals(4, MostCommonNumber.findMostCommonNumber(new int[]{1, 1, 2, 3, 4, 4, 4}));
    }

    @Test
    void findMostCommonMinimumNumberIfThereAreSeveral () {
        assertEquals(1, MostCommonNumber.findMostCommonNumber(new int[]{1, 1, 2, 3, 4, 4}));
    }

    @Test
    void findMostCommonNumberIfAllNumbersAreDifferent () {
        assertEquals(3, MostCommonNumber.findMostCommonNumber(new int[]{3, 5, 6, 8, 7, 95}));
    }
}