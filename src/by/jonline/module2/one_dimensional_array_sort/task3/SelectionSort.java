/*
    Сортировка выбором.
    Дана последовательность чисел a1 <= a2 <=...<= an.Требуется переставить элементы так,
чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
повторяется. Написать алгоритм сортировки выбором.
 */

package by.jonline.module2.one_dimensional_array_sort.task3;

public class SelectionSort {
    public static int[] sortTheArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int max = arr[i];
            int maxI = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxI = j;
                }
            }

            if (i != maxI) {
                int tmp = arr[i];
                arr[i] = arr[maxI];
                arr[maxI] = tmp;
            }
        }

        for (int j : arr) {
            System.out.print(j + " ");
        }
        return arr;
    }
}

