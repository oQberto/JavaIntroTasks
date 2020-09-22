/*
Найдите наибольший элемент матрицы и заменить все нечетные элементы на него
 */

package by.jonline.module2.two_dimensional_array.task15;

public class ReplacementOfElements {
    protected static int maxElement = Integer.MIN_VALUE;

    public static int[][] replaceOddMatrixElements(int[][] matrix) {

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (anInt > maxElement) {
                    maxElement = anInt;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j += 2) {
                matrix[i][j] = maxElement;
            }
        }
        return matrix;
    }
}
