/*
Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
столбец содержит максимальную сумму.
 */

package by.jonline.module2.two_dimensional_array.task9;

public class ColumnWithMaximumSum {
    public static int findTheColumnWithMaximumSum(int[][] matrix) {
        int sum = 0;
        int columnNumber = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[j][i];
            }
            if (sum > Integer.MIN_VALUE) {
                columnNumber = i;
            }
        }

        return columnNumber;
    }
}
