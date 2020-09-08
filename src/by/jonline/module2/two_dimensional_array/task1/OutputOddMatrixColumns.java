/*
Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */

package by.jonline.module2.two_dimensional_array.task1;

public class OutputOddMatrixColumns {
    public static void displayOddColumnsOfAMatrix (int[][] matrix) {
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j += 2) {
                if (matrix[0][j] > matrix[matrix.length - 1][j]) {
                    System.out.print(ints[j] + "\t");
                }
            }
            System.out.println();
        }
    }
}