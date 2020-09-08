/*
Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */

package by.jonline.module2.two_dimensional_array.task3;

public class OutputArrayPart {
    public static void printPartOfAnArray(int[][] matrix, int lineNumber, int columnNumber) {

        for (int j = 0; j < matrix[lineNumber].length; j++) {
            System.out.print(matrix[lineNumber][j] + " ");
        }

        System.out.println();


        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][columnNumber] + " ");
        }
        System.out.println();
    }
}