package by.jonline.module2.two_dimensional_array.task14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixFormationTest {

    @Test
    void formASquareMatrix() {
        int[][] expected =
                                {{0, 1, 1, 1, 1},
                                 {0, 0, 1, 1, 1},
                                 {0, 0, 0, 1, 1},
                                 {0, 0, 0, 0, 1}};

        assertArrayEquals(expected, MatrixFormation.formASquareMatrix(4, 5));
    }
}