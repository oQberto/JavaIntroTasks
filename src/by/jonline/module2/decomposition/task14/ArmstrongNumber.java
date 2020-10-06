/*
Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
использовать декомпозицию.
 */

package by.jonline.module2.decomposition.task14;

import java.util.ArrayList;
import java.util.List;

public class ArmstrongNumber {

    public static List<Integer> findArmstrongNumber(int userInput) {
        List<Integer> integerList = new ArrayList<>();

        for (int i = 1; i < userInput; i++) {
            int[] array = formAnArrayFromANumber(i);
            int temp = 0;
            for (int k : array) {
                temp += Math.pow(k, countDigits(i));
            }
            if (temp == i) {
                integerList.add(i);
            }
        }
        listOutput(integerList);

        return integerList;
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
        int count = 1;

        while (userNumber / 10 != 0) {
            userNumber = userNumber / 10;
            count++;
        }
        return count;
    }

    private static <E> void listOutput(List<E> list) {
        for (E list1 : list) {
            System.out.print(" " + list1 + " ");
        }
    }
}
