/*
Дана последовательность дейставительных чисел a1, a2, ..., an. Заменить все ее члены, большие данного Z, этим числом.
Пдсчитать количечтво замен.
 */
package by.jonline.module2.one_dimensional_array.task2;

import java.util.Arrays;

public class ReplacementOfNumbers {
    public static int replacingArrayNumbersWithUserNumber (int userNumber, int[] userArray) {
        int count = 0;

        for (int i = 0; i < userArray.length; i++) {
            if (userNumber > userArray[i]) {
                userArray[i] = userNumber;
                count++;
            }
        }
        return count;
    }
}
