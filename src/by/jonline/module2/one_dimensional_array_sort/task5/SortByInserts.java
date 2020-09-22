/*
    Сортировка вставками.
    Дана последовательность чисел a1, a2, ..., an. Требуется переставить числа в порядке
возростания. Делается это следующим образом. Пусть a1, a2, ..., ai - упорядоченная последовательность, т.е.
a1 <= a2 <= ... <= an. Берется следующее число a(i+1) и вставляется в последовательность так, чтобы новая
последовательность тоже была возрастающей. Процесс производится до тех пор, пока все элементы от i+1 до n
не будут перебраны.
    Примечание. Место помещения очередного элемента в отсортированную часть производить
с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
 */

package by.jonline.module2.one_dimensional_array_sort.task5;

public class SortByInserts {
    public static int[] sortTheArrayByInserts(int[] array) {
        for (int i = array.length / 2; i < array.length; i++) {
            int index = binarySearch(array, array[i], i - 1);
            int temp = array[i];

            for (int j = i; j > index; j--) {
                array[j] = array[j - 1];
            }
            array[index] = temp;
        }

        for (int j : array) {
            System.out.print(j + " ");
        }

        return array;
    }

    private static int binarySearch(int[] array, int numberSearch, int lastIndex) {
        int firstIndex = 0;
        int middleIndex;

        while (firstIndex <= lastIndex) {

            middleIndex = (firstIndex + lastIndex) / 2;

            if (array[middleIndex] < numberSearch) {
                firstIndex = middleIndex + 1;
            } else if (array[middleIndex] > numberSearch) {
                lastIndex = middleIndex - 1;
            }
        }
        middleIndex = (firstIndex + lastIndex + 1) / 2;

        return middleIndex;
    }
}
