package by.jonline.module1.branching.task5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionValueTest {

    @Test
    void calculateFunctionValueUserInputMoreThan3() {
        assertEquals(1.0 / 70.0, FunctionValue.calculateFunctionValue(4));
    }

    @Test
    void calculateFunctionValueUserInputLess3() {
        assertEquals(7, FunctionValue.calculateFunctionValue(2));
    }

    @Test
    void calculateFunctionValueUserInputEquals3() {
        assertEquals(9, FunctionValue.calculateFunctionValue(3));
    }
}