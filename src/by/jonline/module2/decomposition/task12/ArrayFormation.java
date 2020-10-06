/*
Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
являются числа, сумма цифр которых равна К и которые не большее N.
 */

package by.jonline.module2.decomposition.task12;

public class ArrayFormation {

    public static int[] formANewArray(int firstUserNumber, int secondUserNumber) {

        int[] arrTemp = new int[secondUserNumber / 5];
        int j = 0;

        for (int i = 0; i < secondUserNumber; i++) {
            if (sumDigitsNumber(i) == firstUserNumber) {
                arrTemp[j] = i;
                j++;
            }
        }

        int[] arr = new int[j];

        if (j >= 0) {
            System.arraycopy(arrTemp, 0, arr, 0, j);
        }

        return arr;
    }

    private static int sumDigitsNumber(int number) {
        int sum = 0;
        for (int dig : formAnArrayFromANumber(number)) {
            sum += dig;
        }
        return sum;
    }

    private static int[] formAnArrayFromANumber(int userNumber) {
        int arrayLength = countDigits(userNumber);
        int[] finalArray = new int[arrayLength];
        int a = (int) Math.pow(10, arrayLength - 1);

        for (int i = 0; i < finalArray.length; i++) {
            finalArray[i] = (userNumber / a) % 10;
            a = a / 10;
        }
        return finalArray;
    }

    private static int countDigits(int userNumber) {
        int count = 0;

        while (userNumber / 10 != 0) {
            userNumber = userNumber / 10;
            count++;
        }
        return count;
    }
}
