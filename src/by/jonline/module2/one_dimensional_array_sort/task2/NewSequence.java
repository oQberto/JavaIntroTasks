/*
Даны две последовательности
a1 <= a2 <=...<= an и b1 <= b2 <=...<= bm. Образовать из них новую последовательность
чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
 */

package by.jonline.module2.one_dimensional_array_sort.task2;

import java.util.Arrays;

public class NewSequence {
    public static int[] fromTwoSequenceIntoAThird(int[] firstArray, int[] secondArray) {
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        firstArray = Arrays.copyOf(firstArray, firstArray.length + secondArray.length);

        for (int i = firstArray.length - secondArray.length, j = 0; i < firstArray.length; i++, j++) {
            firstArray[i] = secondArray[j];
        }

        Arrays.sort(firstArray);

        for (int j : firstArray) {
            System.out.print(j + " ");
        }

        return firstArray;
    }
}
