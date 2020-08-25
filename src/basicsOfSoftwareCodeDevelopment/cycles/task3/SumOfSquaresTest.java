package basicsOfSoftwareCodeDevelopment.cycles.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfSquaresTest {

    @Test
    void calculateTheSumOfSquares() {
        assertEquals(338_350, SumOfSquares.calculateTheSumOfSquares());
    }
}