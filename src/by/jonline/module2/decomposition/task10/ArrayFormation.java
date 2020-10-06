/*
Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
являются цифры числа N.
 */

package by.jonline.module2.decomposition.task10;

public class ArrayFormation {

    public static int[] formAnArrayFromANumber(int userNumber) {
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
        int count = 1;

        while (userNumber / 10 != 0) {
            userNumber = userNumber / 10;
            count++;
        }

        return count;
    }
}
