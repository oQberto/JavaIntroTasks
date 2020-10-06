/*
Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
которое меньше максимального элемента массива, но больше всех других элементов).
 */

package by.jonline.module2.decomposition.task5;

public class SecondLargest {

    public static int findTheSecondLargestNumber(int[] array) {
        sortArray(array);
        return array[1];
    }

    public static int[] sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int max = array[i];
            int maxI = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                    maxI = j;
                }
            }

            if (i != maxI) {
                int tmp = array[i];
                array[i] = array[maxI];
                array[maxI] = tmp;
            }
        }
        return array;
    }
}
