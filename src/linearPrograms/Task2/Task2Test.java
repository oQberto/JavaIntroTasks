package linearPrograms.Task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void expressionValue() {

        assertEquals(Double.NaN, Task2.expressionValue(5, 4.1, -7));
    }
}