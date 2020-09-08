/*
Сформировать квадратную матрицу порядка n по заданному образцу (n - четное):
 1  1  1  1 ... 1 1
 2  2  2  2 ... 2 0
 3  3  3  3 ... 0 0
 .  .  .  .     . .
 .  .  .  .     . .
n-1 n-1 0 ... 0 0 0
 n   0  0 ... 0 0 0
 */

package by.jonline.module2.two_dimensional_array.task5;

import java.util.Arrays;

public class MatrixFormation {
    public static int[][] formASquareMatrix(int matrixOrder) {

        int[][] matrix = new int[matrixOrder][matrixOrder];

        if (matrixOrder % 2 == 0) {

            for (int i = 0; i < matrix.length; i++) {
                Arrays.fill(matrix[i], 0, matrix.length - i, i + 1);
            }

            /*for (int[] ints : matrix) {
                for (int anInt : ints) {
                    System.out.print(anInt + "\t");
                }
                System.out.println();
            }*/
        } else {
            System.out.println("Порядок матрицы должен быть четный!");
        }
        return matrix;
    }
}