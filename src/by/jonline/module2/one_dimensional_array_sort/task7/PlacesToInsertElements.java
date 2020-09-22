/*
Пусть даны две неубывающие последовательности действительных чисел a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm.
Требуется указать те места, на которые нужно вставлять элементы последовательности b1 <= b2 <= ... <= bm в первую
последовательность так, чтобы новая последовательность оставалась возрастающей.
 */

package by.jonline.module2.one_dimensional_array_sort.task7;

public class PlacesToInsertElements {
    public static int[] specifyWhereToInsertElements(int[] firstArray, int[] secondArray) {
        int[] arrayOfElements;

        if (firstArray.length > secondArray.length) {
            arrayOfElements = new int[firstArray.length];
            for (int i = 0; i < firstArray.length; i++) {
                int index = binarySearch(secondArray, firstArray[i]);

                arrayOfElements[i] = index + i;
            }
        } else {
            arrayOfElements = new int[secondArray.length];
            for (int i = 0; i < secondArray.length; i++) {
                int index = binarySearch(firstArray, secondArray[i]);

                arrayOfElements[i] = index + i;
            }
        }
        arrayOutput(arrayOfElements);

        return arrayOfElements;
    }

    private static int binarySearch(int[] array, int indexForSearch) {
        int firstIndex = 0;
        int lastIndex = array.length - 1;
        int middleIndex;

        while (firstIndex <= lastIndex) {
            middleIndex = (firstIndex + lastIndex) / 2;

            if (array[middleIndex] < indexForSearch) {
                firstIndex = middleIndex + 1;
            } else if (array[middleIndex] > indexForSearch) {
                lastIndex = middleIndex - 1;
            }
        }
        middleIndex = (firstIndex + lastIndex + 1) / 2;

        return middleIndex;
    }

    private static void arrayOutput(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
