/*
Дана последовательность целых чисел a1, a2, ..., an.
Образовать новую последовательность, выбросив из исходной те члены, которые равны
min(a1, a2, ..., an).
 */
package by.jonline.module2.one_dimensional_array.task8;

import java.util.Arrays;

public class NewArray {

    public static String creatingANewArray(int[] sequenceOfNumbers) {

        int count = 0;
        int min = Integer.MAX_VALUE;

        for (int d : sequenceOfNumbers) {
            if (d < min) {
                count = 1;
                min = d;
            } else if (d == min) {
                count++;
            }
        }

        int i = 0;
        int[] result = new int[sequenceOfNumbers.length - count];
        for (int d : sequenceOfNumbers) {
            if (d > min) {
                result[i++] = d;
            }
        }
        return Arrays.toString(result);
    }
}