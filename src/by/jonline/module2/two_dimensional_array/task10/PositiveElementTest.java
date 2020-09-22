package by.jonline.module2.two_dimensional_array.task10;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PositiveElementTest {

    @Test
    void findPositiveEntriesOfTheMainDiagonalOfAMatrix() {
        int[][] matrix =
                        {{1, 2, 3},
                         {4, 5, 6},
                         {7, 8, 9}};

        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(5);
        expected.add(9);

        assertEquals(expected, PositiveElement.findPositiveEntriesOfTheMainDiagonalOfAMatrix(matrix));
    }
}