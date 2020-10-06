/*
Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */

package by.jonline.module2.decomposition.task2;

public class OperationsOnNumbers {

    public static int findGreatestCommonDivisor(int[] array) {
        int gcd = gcd(array[0], array[1]);

        for (int i = 2; i < array.length; i++) {
            gcd = gcd(gcd, array[i]);
        }
        return gcd;
    }

    private static int gcd(int firstNumber, int secondNumber) {
        return secondNumber == 0 ? firstNumber : gcd(secondNumber, firstNumber % secondNumber);
    }

    private static int lcm(int firstNumber, int secondNumber) {
        return firstNumber / gcd(firstNumber, secondNumber) * secondNumber;
    }
}
