/*
Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */

package by.jonline.module2.two_dimensional_array.task2;

public class DiagonalOutput {
    public static void displayTheElementsOfTheMatrixOnTheDiagonal (int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == 0 && j == 0) {
                    System.out.print(matrix[i][j] + " ");
                }

                else if (i == j) {
                    System.out.print(" " + matrix[i][j] + " ");
                }

                else if (i + j == matrix.length - 1) {
                    System.out.print(matrix[i][j]);
                }
            }
            System.out.println();
        }
    }
}