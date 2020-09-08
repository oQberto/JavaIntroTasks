/*
Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
являются простыми числами.
 */
package by.jonline.module2.one_dimensional_array.task6;

public class SumOfNumbers {
    public static int sumOfPrimeNumbers (int[] userArray) {
        int sum = 0;

        for (int j : userArray) {
            if (isPrime(j)) sum += j;
        }
        return sum;
    }

    public static boolean isPrime (int arrayNumberToCheck) {
        int temp;

        if (arrayNumberToCheck == 1) return false;

        for (int i = 2; i < arrayNumberToCheck / 2; i++) {
            temp = arrayNumberToCheck % i;
            if (temp == 0) return false;
        }
        return true;
    }
}
