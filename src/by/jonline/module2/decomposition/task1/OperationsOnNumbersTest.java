package by.jonline.module2.decomposition.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationsOnNumbersTest {

    @Test
    void lcm() {
        int firstNumber = 3;
        int secondNumber = 4;

        int expected = 12;

        assertEquals(expected, OperationsOnNumbers.lcm(firstNumber, secondNumber));
    }

    @Test
    void gcd() {
        int firstNumber = 10;
        int secondNumber = 24;

        int expected = 2;

        assertEquals(expected, OperationsOnNumbers.gcd(firstNumber, secondNumber));
    }
}