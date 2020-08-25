package basicsOfSoftwareCodeDevelopment.cycles.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfNumbersTest {

    @Test
    void userInputMoreThan0 () {
        assertEquals(3, SumOfNumbers.sumOfNumbersUpToUserNumber(3));
    }

    @Test
    void userInputLessThan0 () {
        assertEquals(0, SumOfNumbers.sumOfNumbersUpToUserNumber(-2));
    }
}