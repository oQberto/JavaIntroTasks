/*
Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3, ... ,n^2
так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
собой. Построить такой квадрат. Пример магического квадрата порядка 3:
                                            6 1 8
                                            7 5 3
                                            2 9 4
 */

package by.jonline.module2.two_dimensional_array.task16;

public class MagicSquare {
    /*
    Метод evenMatrixSquare предназначен для построения магического квадрата четного-четного порядка,
    то есть такой порядок делится на 4. Использовался алгоритм Роуз-Болла: http://www.klassikpoez.narod.ru/metody.htm
     */
    public static int[][] evenMatrixSquare(int n) {
        int[][] matrix = standardMatrixFilling(n);
        int count = 0;

        for (int i = 0; i < matrix.length / 2; i++) {
            int temp;
            if (i < matrix.length / 2) {
                temp = matrix[i][i];
                matrix[i][i] = matrix[matrix.length - 1 - count][matrix.length - 1 - count];
                matrix[matrix.length - 1 - count][matrix.length - 1 - count] = temp;
                count++;
            }
        }

        count = 0;

        for (int i = 0; i < matrix.length / 2; i++) {
            int temp;
            if (i < matrix.length / 2) {
                temp = matrix[matrix.length - 1 - count][i];
                matrix[matrix.length - 1 - count][i] = matrix[i][matrix.length - 1 - count];
                matrix[i][matrix.length - 1 - count] = temp;
                count++;
            }
        }
        printMatrix(matrix);

        return matrix;
    }

    /*
     Метод oddMagicSquare предназначен для построения магического квадрата произвольного нечетного порядка.
     Для пострения использовался Сиамский метод: http://www.natalimak1.narod.ru/metody1.htm
     */
    public static int[][] oddMagicSquare(int n) {
        int[][] matrix = new int[n][n];

        int x = n / 2;
        int y = matrix.length - 1;
        int count = 1;

        while (true) {
            matrix[(matrix.length - 1) - y][x] = count;
            count++;

            if (x == matrix.length - 1) {
                x = -1;
            }
            if (y >= matrix.length - 1) {
                y = -1;
            }

            y++;
            x++;

            if (matrix[matrix.length - 1 - y][x] != 0) {
                y -= 2;
                x -= 1;
            }

            int count1 = 0;
            for (int[] array : matrix) {
                for (int z : array) {
                    if (z == 0) {
                        count1++;
                    }
                }
            }
            if (count1 == 0) {
                break;
            }
        }
        printMatrix(matrix);

        return matrix;
    }

    private static int[][] standardMatrixFilling(int n) {
        int[][] matrix = new int[n][n];
        int count = 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = count;
                count++;
            }
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] array : matrix) {
            for (int x : array) {
                System.out.print(x + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}