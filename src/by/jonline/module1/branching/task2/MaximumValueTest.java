package by.jonline.module1.branching.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumValueTest {

    @Test
    void findMaxWhenMinimumInTheFirstPair () {
        assertEquals(2, MaximumValue.findMax(4, 2, 1, 3));
    }

    @Test
    void findMaxWhenMinimumInTheSecondPair () {
        assertEquals(3, MaximumValue.findMax(4, 2, 3, 6));
    }

    @Test
    void findMaxWhenAllNumbersInPairsAreEqual () {
        assertEquals(2, MaximumValue.findMax(2, 2, 2, 2));
    }
}