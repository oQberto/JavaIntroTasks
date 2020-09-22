/*
    Сортировка Шелла.
    Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
Делается это следующим образом: сравниваются два соседних элемента ai и ai+1. Если ai <= ai+1,
то продвигаются на один элемент вперед. Если ai > ai+1, то производится перестановка и сдвигаются
на один элемент назад.
Составить алгоритм этой сортировки.
 */

package by.jonline.module2.one_dimensional_array_sort.task6;

public class ShellSort {
    public static int[] sortTheArrayByShellSort(int[] array) {
        int gap = array.length / 2;

        while (gap >= 1) {
            for (int right = 0; right < array.length; right++) {
                for (int c = right - gap; c >= 0; c -= gap) {
                    if (array[c] > array[c + gap]) {
                        swap(array, c, c + gap);
                    }
                }
            }
            gap = gap / 2;
        }
        arrayOutput(array);

        return array;
    }

    private static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    private static void arrayOutput(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
