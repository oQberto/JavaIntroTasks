/*
В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
Если таких чисел несколько, то определить наименьшее из них.
 */
package by.jonline.module2.one_dimensional_array.task9;

public class MostCommonNumber {
    public static int findMostCommonNumber(int[] array) {
        int res = 0;
        int[] counts = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j])
                    count++;
            }

            counts[i] = count;
            if (counts[i] == counts[res]) {
                res = array[res] > array[i] ? i : res;
            } else {
                res = count > counts[res] ? i : res;
            }
        }
        return array[res];
    }
}
