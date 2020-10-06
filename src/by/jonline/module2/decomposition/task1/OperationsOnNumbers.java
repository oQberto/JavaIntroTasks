/*
Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
натуральных чисел:
 */

package by.jonline.module2.decomposition.task1;

public class OperationsOnNumbers {

    public static int lcm(int firstNumber, int secondNumber) {
        return firstNumber / gcd(firstNumber, secondNumber) * secondNumber;
    }

    public static int gcd(int firstNumber, int secondNumber) {
        return secondNumber == 0 ? firstNumber : gcd(secondNumber, firstNumber % secondNumber);
    }
}
