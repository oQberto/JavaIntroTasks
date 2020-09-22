/*
Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
дополнительный массив
 */

package by.jonline.module2.one_dimensional_array_sort.task1;

public class OneMassOfTwo {
    public static int[] creatingOneArrayOfTwo(int[] firstArray, int[] secondArray, int k) {
        int[] finalArray = new int[(firstArray.length + secondArray.length)];

        int count = 0;
        for (int i = 0; i < finalArray.length; i++) {
            if (k > i) {
                finalArray[i] = firstArray[i];
            } else if (count <= k) {
                finalArray[i] = secondArray[count];
                count++;
            } else {
                finalArray[i] = firstArray[i - k - 1];
            }
        }

        for (int x : finalArray) {
            System.out.print(x + " ");
        }

        return finalArray;
    }
}
