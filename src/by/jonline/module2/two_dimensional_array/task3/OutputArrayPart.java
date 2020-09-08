/*
Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */

package by.jonline.module2.two_dimensional_array.task3;

public class OutputArrayPart {
    public static void printPartOfAnArray(int[][] matrix, int lineNumber, int columnNumber) {

        for (int i = lineNumber; i < matrix.length; ) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
            break;
        }

        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = columnNumber; j < matrix[i].length;) {
                System.out.print(matrix[i][j] + " ");
                break;
            }
            System.out.println();
        }
    }
}