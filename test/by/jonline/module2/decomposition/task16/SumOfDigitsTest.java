package by.jonline.module2.decomposition.task16;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfDigitsTest {

    @Test
    void sumOfOddDigitsNumbers() {
        int userInput = 2;

        int expected = 1375;

        assertEquals(expected, SumOfDigits.sumOfOddDigitsNumbers(userInput));
    }
}