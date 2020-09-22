/*
Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
единиц равно номеру столбца.
 */

package by.jonline.module2.two_dimensional_array.task14;

import java.util.Arrays;

public class MatrixFormation {
    public static int[][] formASquareMatrix(int n, int m) {
        int[][] matrix = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            Arrays.fill(matrix[i], i + 1, matrix.length + 1, 1);
        }
        return matrix;
    }
}
