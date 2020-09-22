package by.jonline.module2.two_dimensional_array.task15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ReplacementOfElementsTest {
    @Test
    void findMaxMatrixElement() {
        int expected = 9;

        int[][] matrix =
                        {{5, 6, 7, 8},
                         {9, 7, 7, 8},
                         {1, 2, 3, 4}};
        ReplacementOfElements.replaceOddMatrixElements(matrix);

        assertEquals(expected, ReplacementOfElements.maxElement);
    }

    @Test
    void replaceOddMatrixElements() {

        int[][] expected =
                        {{5, 9, 7, 9},
                         {9, 9, 7, 9},
                         {1, 9, 3, 9}};

        int[][] matrix =
                        {{5, 6, 7, 8},
                         {9, 7, 7, 8},
                         {1, 2, 3, 4}};

        assertArrayEquals(expected, ReplacementOfElements.replaceOddMatrixElements(matrix));
    }


}