package by.jonline.module2.two_dimensional_array.task9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColumnWithMaximumSumTest {

    @Test
    void findTheColumnWithMaximumSum() {
        int[][] matrix =
                        {{1, 2, 3},
                         {4, 5, 6},
                         {7, 8, 9}};

        assertEquals(2, ColumnWithMaximumSum.findTheColumnWithMaximumSum(matrix));
    }
}