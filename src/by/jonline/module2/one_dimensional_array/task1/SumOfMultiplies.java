/*
В массив A [N] занесены натуральные числа. Найти сумму тех элементов,
которые кратны данному K.
 */

package by.jonline.module2.one_dimensional_array.task1;

public class SumOfMultiplies {
    public static int findTheSumOfMultipliesOfAGivenNumber (int[] array, int userNumber) {
        int sum = 0;

        for (int arrayNumber : array) {
            if (arrayNumber % userNumber == 0) {
                sum += arrayNumber;
            }
        }
        return sum;
    }
}
