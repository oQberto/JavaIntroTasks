package by.jonline.module1.linear_program.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void expressionValue() {
        assertEquals(Double.NaN, Task2.expressionValue(5, 4.1, -7));
        assertEquals(0.25, Task2.expressionValue(1, 2, 3));
    }

}