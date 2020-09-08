package by.jonline.module1.cycle.task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompositionOfSquaresTest {

    @Test
    void calculateProductOfSquares() {
        assertEquals(Integer.MAX_VALUE, CompositionOfSquares.calculateProductOfSquares());
    }
}