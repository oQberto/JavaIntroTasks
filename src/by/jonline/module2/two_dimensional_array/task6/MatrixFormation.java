/*
Сформировать квадратную матрицу порядка n по заданному образцу (n - четное):
1 1 1 ... 1 1 1
0 1 1 ... 1 1 0
0 0 1 ... 1 0 0
0 0 1 ... 1 0 0
0 1 1 ... 1 1 0
1 1 1 ... 1 1 1
 */

package by.jonline.module2.two_dimensional_array.task6;

public class MatrixFormation {
    public static int[][] formASquareMatrix(int matrixOrder) {
        int[][] matrix = new int[matrixOrder][matrixOrder];

        if (matrixOrder % 2 == 0) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if ((i <= j) && (j <= matrix.length - 1 - i) || (i >= j) && (j >= matrix.length - 1 - i)) {
                        matrix[i][j] = 1;
                    } else {
                        matrix[i][j] = 0;
                    }
                }
            }
            matrixOutput(matrix);
            return matrix;
        } else {
            return null;
        }
    }

    public static void matrixOutput(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
