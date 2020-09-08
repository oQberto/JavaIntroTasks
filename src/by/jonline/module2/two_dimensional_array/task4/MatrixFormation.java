/*
Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */

package by.jonline.module2.two_dimensional_array.task4;

public class MatrixFormation {
    public static void formASquareMatrix (int matrixOrder) {
        int[][] matrix = new int[matrixOrder][matrixOrder];

        if (matrixOrder % 2 == 0) {
            for (int i = 0; i < matrix.length; i += 2) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = j + 1;
                }
            }

            for (int i = 1; i < matrix.length; i += 2) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = matrixOrder - j;
                }
            }

            for (int[] ints : matrix) {
                for (int anInt : ints) {
                    System.out.print(anInt + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Порядок матрицы должен быть четным!");
        }
    }
}