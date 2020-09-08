/*
Дан массив действительных чисел, размерность которго N.
Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
 */
package by.jonline.module2.one_dimensional_array.task3;

public class ArrayCount {
    static int countNegative = 0;
    static int countPositive = 0;
    static int countZeroes = 0;

    public static int countingNegativeNumbersInAnArray (int[] userArray) {
        for (int arrayNumber : userArray) {
            if (arrayNumber < 0) countNegative++;
        }
        return countNegative;
    }

    public static int countingPositiveNumbersInTheArray (int[] userArray) {
        for (int arrayNumber : userArray) {
            if (arrayNumber > 0) countPositive++;
        }
        return countPositive;
    }

    public static int countingZeroesInAnArray (int[] userArray) {
        for (int arrayNumber : userArray) {
            if (arrayNumber == 0) countZeroes++;
        }
        return countZeroes;
    }
}
