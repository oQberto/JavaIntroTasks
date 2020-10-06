/*
 Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 */

package by.jonline.module2.decomposition.task7;

public class SumOfFactorials {

    public static int findSumOfFactorials(int[] array) {
        int sumOfFactorials = 0;
        for (int i = 1; i <= array.length; i++) {
            if (i % 2 != 0) {
                sumOfFactorials += findFactorial(i);
            }
        }
        return sumOfFactorials;
    }

    public static int findFactorial(int number) {
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
