/*
Даны действительные числа a1, a2, ... an.
Поменять местами наибольший и наименьший элементы.
 */
package by.jonline.module2.one_dimensional_array.task4;

import java.util.Arrays;

public class MaxSwapMin {
    public static String swapElements (int[] userArray) {
        int min = 0;
        int max = 0;
        int temp;

        for (int i = 0; i < userArray.length; i++) {
            if (userArray[min] > userArray[i]) min = i;
            if (userArray[max] < userArray[i]) max = i;
        }
        temp = userArray[min];
        userArray[min] = userArray[max];
        userArray[max] = temp;

        return Arrays.toString(userArray);
    }
}
