/*
Отсортировать строки матрицы по возрастанию и убыванию значений элементов
 */

package by.jonline.module2.two_dimensional_array.task12;

public class SortingRows {
    public static void sortMatrixRows(int[][] matrix) {

        for (int[] ints : matrix) {
            bubbleSortInAscending(ints);
        }
        matrixOutput(matrix);

        System.out.println();

        for (int[] ints : matrix) {
            bubbleSortInDescending(ints);
        }
        matrixOutput(matrix);
    }

    public static void bubbleSortInAscending(int[] matrix) {
        int temp;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length - 1; j++) {
                if (matrix[j] > matrix[j + 1]) {
                    for (int k = 0; k < matrix.length; k++) {
                        temp = matrix[j];
                        matrix[j] = matrix[j + 1];
                        matrix[j + 1] = temp;
                    }
                }
            }
        }
    }

    public static void bubbleSortInDescending(int[] matrix) {
        int temp;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length - 1; j++) {
                if (matrix[j] < matrix[j + 1]) {
                    for (int k = 0; k < matrix.length; k++) {
                        temp = matrix[j];
                        matrix[j] = matrix[j + 1];
                        matrix[j + 1] = temp;
                    }
                }
            }
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