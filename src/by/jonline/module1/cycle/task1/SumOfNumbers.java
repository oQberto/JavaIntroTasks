/*
Написать программу, где пользователь вводит любое целое положительное число.
А программа суммирует все числа от 1 до введенного пользователем числа.
 */
package by.jonline.module1.cycle.task1;

public class SumOfNumbers {
    public static int sumOfNumbersUpToUserNumber (int userNumber) {
        int finalValue = 0;

        for (int i = 0; i < userNumber; i++) {
            finalValue += i;
        }
        return finalValue;
    }
}