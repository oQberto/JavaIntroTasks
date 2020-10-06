package by.jonline.module2.decomposition.task14;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArmstrongNumberTest {

    @Test
    void findArmstrongNumber() {
        int userInput = 1000;

        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        expected.add(8);
        expected.add(9);
        expected.add(153);
        expected.add(370);
        expected.add(371);
        expected.add(407);

        assertEquals(expected, ArmstrongNumber.findArmstrongNumber(userInput));
    }
}