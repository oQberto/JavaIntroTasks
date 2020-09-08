/*
Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
 */
package by.jonline.module2.one_dimensional_array.task10;

import java.util.Arrays;

public class CompressedArray {
    public static String compressedTheArrayByDiscardingEverySecondElement(int[] array) {
        if (array.length < 2) {
            return Arrays.toString(array);
        }

        int count = 1;
        if (array.length > 2) {

            for (int i = 2; i < array.length; i += 2) {
                array[count] = array[i];
                count++;
            }
            array = Arrays.copyOf(array, array.length);
            if (array.length % 2 == 0) {
                Arrays.fill(array, array.length / 2, array.length, 0);
            } else {
                Arrays.fill(array, array.length / 2 + 1, array.length, 0);
            }
        } else {
            array = Arrays.copyOf(array, array.length / 2);
        }
        return Arrays.toString(array);
    }
}