/*
Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
которых число 5 встречается три и более раз.
 */

package by.jonline.module2.two_dimensional_array.task11;

public class HowManyTimes {
    public static void howManyTimesANumberOccurs() {
        int[][] matrix = new int[10][20];
        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 16);
                if (matrix[i][j] == 5) {
                    count++;

                }
            }
            if (count == 3) {
                System.out.println("В строке " + i + " число 5 встречается 3 и более раз.");
            }
            count = 0;
        }

        System.out.println();
        matrixOutput(matrix);
    }

    public static void matrixOutput(int [][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}