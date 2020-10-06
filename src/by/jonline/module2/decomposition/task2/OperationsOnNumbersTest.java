package by.jonline.module2.decomposition.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OperationsOnNumbersTest {

    @Test
    void testFindGreatestCommonDivisor() {
        int[] array = {78, 294, 570, 36};
        int expected = 6;

        Assertions.assertEquals(expected, OperationsOnNumbers.findGreatestCommonDivisor(array));
    }
}