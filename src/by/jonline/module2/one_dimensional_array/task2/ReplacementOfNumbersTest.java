package by.jonline.module2.one_dimensional_array.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplacementOfNumbersTest {

    @Test
    void replacingArrayNumbersWithUserNumber () {
        assertEquals(2, ReplacementOfNumbers.replacingArrayNumbersWithUserNumber(2, new int[]{1, 1, 3, 3}));
    }
}