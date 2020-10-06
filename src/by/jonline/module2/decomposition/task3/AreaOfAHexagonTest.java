package by.jonline.module2.decomposition.task3;

import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class AreaOfAHexagonTest {

    @Test
    void testFindTheAreaOfHexagon() {
        int sideOfTheHexagon = 3;
        String expected = "23,38";

        DecimalFormat decimalFormat = new DecimalFormat("###.##");

        assertEquals(expected, decimalFormat.format(AreaOfAHexagon.findTheAreaOfHexagon(sideOfTheHexagon)));
    }
}