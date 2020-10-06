package by.jonline.module2.decomposition.task11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoreNumbersTest {

    @Test
    void theFirstNumberHasMoreDigitsThenTheSecondNumber() {
        int firstUserNumber = 123456;
        int secondUserNumber = 12345;

        assertEquals(firstUserNumber, MoreNumbers.determineWhichNumberHasMoreDigits(firstUserNumber, secondUserNumber));
    }

    @Test
    void theSecondNumberHasMoreDigitsThenTheFirstNumber() {
        int firstNumber = 123;
        int secondNumber = 1234;

        assertEquals(secondNumber, MoreNumbers.determineWhichNumberHasMoreDigits(firstNumber, secondNumber));
    }

    @Test
    void bothNumbersHaveTheSameNumberOfDigits() {
        int firstUserNumber = 123;
        int secondUserNumber = 123;

        int expected = 0;
        assertEquals(expected, MoreNumbers.determineWhichNumberHasMoreDigits(firstUserNumber, secondUserNumber));
    }
}