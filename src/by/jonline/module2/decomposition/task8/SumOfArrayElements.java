/*
 Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
массива с номерами от k до m.
 */

package by.jonline.module2.decomposition.task8;

public class SumOfArrayElements {

    public static int selectThreeConsecutiveElements(int[] array, int fromIndex, int toIndex) {
        int sumOfElements = 0;

        for (int i = fromIndex; i <= toIndex; i++) {
            sumOfElements += array[i];
        }
        return sumOfElements;
    }
}
