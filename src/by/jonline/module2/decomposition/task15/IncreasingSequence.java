/*
Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
 */

package by.jonline.module2.decomposition.task15;

import java.util.ArrayList;
import java.util.List;

public class IncreasingSequence {

    public static List<Integer> findNumbersInWhichTheNumbersAreAscending(int userInput) {
        List<Integer> integerList = new ArrayList<>();

        int k = (int) (Math.pow(10, userInput) - 1);
        int t = (int) (Math.pow(10, userInput - 1));

        for (int i = t; i <= k; i++) {
            int[] array = formAnArrayFromANumber(i);
            boolean flag = true;
            for (int j = 0; j < countDigits(i) - 1; j++) {
                if (array[j] + 1 != array[j + 1]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
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
