/*
    Сортировка обменами.
    Дана последовательность чисел a1 <= a2 <= ... <= an.Требуется переставить числа в
порядке возрастания. Для этого сравниваются два соседних числа ai и a(i+1). Если ai > a(i+1), то делается
перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 */

package by.jonline.module2.one_dimensional_array_sort.task4;

public class SortingExchanges {
    public static int[] sortTheArrayWithExchanges(int[] array) {
        int temp;

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
        return array;
    }
}
