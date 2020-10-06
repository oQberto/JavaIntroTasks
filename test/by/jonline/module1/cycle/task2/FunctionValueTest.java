package by.jonline.module1.cycle.task2;

import by.jonline.module1.cycle.task1.SumOfNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionValueTest {
    @Test
    void userInputMoreThan0 () {
        assertEquals(3, SumOfNumbers.sumOfNumbersUpToUserNumber(3));
    }

    @Test
    void userInputLessThan0 () {
        assertEquals(0, SumOfNumbers.sumOfNumbersUpToUserNumber(-2));
    }
}