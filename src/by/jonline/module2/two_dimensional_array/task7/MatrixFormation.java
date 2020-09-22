/*
Сформировать квадратную матрицу порядка N по правилу:

A[i][j] = sin((i^2 - j^2) / n)

и подсчитать количество положительных элементов в ней.
 */

package by.jonline.module2.two_dimensional_array.task7;

public class MatrixFormation {
    public static int matrixPositiveElements = 0;

    public static double[][] matrixFormation(int matrixOrder) {
        double[][] matrix = new double[matrixOrder][matrixOrder];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Math.sin(((Math.pow(i, 2)) - Math.pow(j, 2)) / matrixOrder);
                if (matrix[i][j] > 0) {
                    matrixPositiveElements++;
                }
            }
        }

        return matrix;
    }
}
