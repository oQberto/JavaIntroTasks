/*
Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 */

package by.jonline.module2.decomposition.task16;

import java.util.List;

public class SumOfDigits {

    public static int sumOfOddDigitsNumbers(int userInput) {
        int k = (int) (Math.pow(10, userInput) - 1);
        int t = (int) (Math.pow(10, userInput - 1));
        int temp = 0;

        for (int i = t; i < k; i++) {
            int[] array = formAnArrayFromANumber(i);
            if (isOdd(array)) {
                temp = getSumDigits(i);
            }

        }
        return temp;
    }

    private static int[] formAnArrayFromANumber(int userNumber) {
        int arrayLength = countDigits(userNumber);
        int[] finalArray = new int[arrayLength];
        int a = (int) Math.pow(10, arrayLength - 1);

        for (int i = 0; i < finalArray.length; i++) {
            finalArray[i] = (userNumber / a) % 10;
            a = a / 10;
        }
        return finalArray;
    }

    private static int countDigits(int userNumber) {
        int count = 0;

        while (userNumber / 10 != 0) {
            userNumber = userNumber / 10;
            count++;
        }
        return count;
    }

    private static boolean isOdd(int[] data)// проверка на отсортированность
    {

        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 0)
                return false;
        }
        return true;
    }

    private static int getSumDigits(int n) {
        int sum = 0;
        while (n != 0) {

            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }

    private static int countEvenDigitsInNumber(int n) {

        int count = 0;
        int[] arr = formAnArrayFromANumber(n);

        for (int j = 0; j < countDigits(n); j++) {
            if (arr[j] % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    private static <E> void listOutput(List<E> list) {
        for (E list1 : list) {
            System.out.print(" " + list1 + " ");
        }
    }
}
