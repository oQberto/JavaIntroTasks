/*
Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
 */

package by.jonline.module2.two_dimensional_array.task13;

public class SortingColumns {

    public static int[][] bubbleSortInAscending(int[][] matrix) {
        int temp;

        for (int j = 0; j < matrix.length; j++) {
            for (int i = matrix.length -1; i > 0; i--) {
                for (int k = 0; k < i; k++) {
                    if (matrix[k][j] > matrix[k + 1][j]) {
                        temp = matrix[k][j];
                        matrix[k][j] = matrix[k + 1][j];
                        matrix[k + 1][j] = temp;
                    }
                }
            }
        }
        return matrix;
    }

    public static int[][] bubbleSortInDescending(int[][] matrix) {
        int temp;

        for (int j = 0; j < matrix.length; j++) {
            for (int i = matrix.length -1; i > 0; i--) {
                for (int k = 0; k < i; k++) {
                    if (matrix[k][j] < matrix[k + 1][j]) {
                        temp = matrix[k][j];
                        matrix[k][j] = matrix[k + 1][j];
                        matrix[k + 1][j] = temp;
                    }
                }
            }
        }
        return matrix;
    }
}
