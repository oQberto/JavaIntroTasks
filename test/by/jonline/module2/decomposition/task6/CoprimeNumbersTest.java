package by.jonline.module2.decomposition.task6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoprimeNumbersTest {

    @Test
    void numbersAreCoprime() {
        int[] array = new int[]{24, 25, 26};

        assertTrue(CoprimeNumbers.numbersAreCoprime(array));
    }

    @Test
    void numbersAreNotCoprime() {
        int[] array = new int[]{4, 6, 8};

        assertFalse(CoprimeNumbers.numbersAreCoprime(array));
    }
}