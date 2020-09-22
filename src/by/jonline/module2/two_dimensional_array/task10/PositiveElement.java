/*
Найти положительные элементы главной диагонали квадратной матрицы.
 */

package by.jonline.module2.two_dimensional_array.task10;

import java.util.*;

public class PositiveElement {
    public static List<Integer> findPositiveEntriesOfTheMainDiagonalOfAMatrix(int[][] matrix) {
        List<Integer> positiveElements = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    positiveElements.add(matrix[i][j]);
                }
            }
        }

        return positiveElements;
    }
}
