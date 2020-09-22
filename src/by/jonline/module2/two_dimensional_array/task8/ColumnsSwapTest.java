package by.jonline.module2.two_dimensional_array.task8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColumnsSwapTest {

    @Test
    void permuteMatrixColumns() {

        int[][] matrix =
                        {{1, 2, 3},
                         {4, 5, 6},
                         {7, 8, 9}};

        int[][] expected =
                        {{3, 2, 1},
                         {6, 5, 4},
                         {9, 8, 7}};

        assertArrayEquals(expected, ColumnsSwap.permuteMatrixColumns(matrix, 0, 2));
    }
}