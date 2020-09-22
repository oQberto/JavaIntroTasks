package by.jonline.module2.two_dimensional_array.task6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixFormationTest {

    @Test
    void formASquareMatrixIfMatrixOrderIsEven() {
        int[][] matrix = new int[][]
                        {{1, 1, 1, 1, 1, 1},
                         {0, 1, 1, 1, 1, 0},
                         {0, 0, 1, 1, 0, 0},
                         {0, 0, 1, 1, 0, 0},
                         {0, 1, 1, 1, 1, 0},
                         {1, 1, 1, 1, 1, 1}};

        assertArrayEquals(matrix, MatrixFormation.formASquareMatrix(6));
    }

    @Test
    void formASquareMatrixIfMatrixOrderIsOdd() {
        assertArrayEquals(null, MatrixFormation.formASquareMatrix(5));
    }
}