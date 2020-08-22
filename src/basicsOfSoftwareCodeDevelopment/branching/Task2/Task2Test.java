package basicsOfSoftwareCodeDevelopment.branching.Task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void findMax() {
        assertEquals(7, Task2.findMax(2, 5, 7, 10));
        assertEquals(0, Task2.findMax(0, 0, 0, 0));
    }
}