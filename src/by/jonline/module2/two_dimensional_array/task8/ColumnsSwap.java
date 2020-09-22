/*
В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
пользователь с клавиатуры.

 */

package by.jonline.module2.two_dimensional_array.task8;

public class ColumnsSwap {
    public static int[][] permuteMatrixColumns(int[][] matrix, int column1, int column2) {
        int temp;

        for (int i = 0; i < matrix.length; i++) {
            temp = matrix[i][column1];
            matrix[i][column1] = matrix[i][column2];
            matrix[i][column2] = temp;
        }
        return matrix;
    }
}
