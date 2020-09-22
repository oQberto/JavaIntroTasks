package by.jonline.module2.two_dimensional_array.task16;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagicSquareTest {

    @Test
    void evenMatrixSquare() {
        int[][] expected =
                        {{16, 2, 3, 13},
                         {5, 11, 10, 8},
                         {9, 7, 6, 12},
                         {4, 14, 15, 1}};

        assertArrayEquals(expected, MagicSquare.evenMatrixSquare(8));
    }

    @Test
    void oddMatrixSquare() {
        int[][] expected =
                        {{30, 39, 48, 1, 10, 19, 28},
                         {38, 47, 7, 9, 18, 27, 29},
                         {46, 6, 8, 17, 26, 35, 37},
                         {5, 14, 16, 25, 34, 36, 45},
                         {13, 15, 24, 33, 42, 44, 4},
                         {21, 23, 32, 41, 43, 3, 12},
                         {22, 31, 40, 49, 2, 11, 20}};

        assertArrayEquals(expected, MagicSquare.oddMagicSquare(7));
    }
}