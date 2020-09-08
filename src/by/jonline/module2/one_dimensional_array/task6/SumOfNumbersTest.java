package by.jonline.module2.one_dimensional_array.task6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfNumbersTest {

    @Test
    void sumOfPrimeNumbers() {
        assertEquals(2, SumOfNumbers.sumOfPrimeNumbers(new int[]{6, 2}));
    }

    @Test
    void isPrime() {
        assertTrue(SumOfNumbers.isPrime(2));
        assertFalse(SumOfNumbers.isPrime(6));
    }
}