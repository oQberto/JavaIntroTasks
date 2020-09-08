package by.jonline.module1.linear_program.task1;

import static org.junit.jupiter.api.Assertions.*;

class ExistenceOfATriangleTest {

    @org.junit.jupiter.api.Test
    void functionValue() {
        assertEquals(2, Task1.functionValue(2, 5, 4));
        assertEquals(46, Task1.functionValue(9, 7, 25));
        assertEquals(0, Task1.functionValue(0, 0, 0));
        assertEquals(-42, Task1.functionValue(-5, 9, -6));
        assertEquals(5, Task1.functionValue(3, 0, 5));
    }
}