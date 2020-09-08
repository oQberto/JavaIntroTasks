package by.jonline.module1.linear_program.task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void reverseNum() {
        assertEquals(111.222, Task4.reverseNum(222.111));
        assertEquals(000.000, Task4.reverseNum(000.000));
        assertEquals(100.001, Task4.reverseNum(100.001));
        assertEquals(956.325, Task4.reverseNum(523.659));
    }
}