package by.jonline.module2.decomposition.task10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayFormationTest {

    @Test
    void formAnArrayFromANumber() {
        int userNumber = 1234;
        int[] expected = new int[]{1, 2, 3, 4};

        assertArrayEquals(expected, ArrayFormation.formAnArrayFromANumber(userNumber));
    }
}