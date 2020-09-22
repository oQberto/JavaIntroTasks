package by.jonline.module2.two_dimensional_array.task5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixFormationTest {

    @Test
    void formASquareMatrixIfMatrixOrderIsEven() {
        int[][] expected = new int[][] {{1, 1, 1, 1}, {2, 2, 2, 0}, {3, 3, 0, 0}, {4, 0, 0, 0}};

        assertArrayEquals(expected, MatrixFormation.formASquareMatrix(4));
    }

    @Test
    void formASquareMatrixIfMatrixOrderIsOdd() {
        assertArrayEquals(null, MatrixFormation.formASquareMatrix(5));
    }
}