package by.jonline.module4.simplest_class_and_object.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test1Test {
    Test1 test1 = new Test1(4, 5);


    @Test
    void greaterImportance() {
        int expected = 5;

        assertEquals(expected, test1.greaterImportance());
    }

    @Test
    void sumOfInts() {
        int expected = 9;

        assertEquals(expected, test1.sumOfInts());
    }

    @Test
    void output() {
        System.out.println(test1.toString());
    }
}