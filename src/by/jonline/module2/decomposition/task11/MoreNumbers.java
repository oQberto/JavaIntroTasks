/*
Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */

package by.jonline.module2.decomposition.task11;

public class MoreNumbers {

    public static int determineWhichNumberHasMoreDigits(int firstUserNumber, int secondUserNumber) {

        if (countDigits(firstUserNumber) > countDigits(secondUserNumber)) {
            return firstUserNumber;
        } else if (countDigits(secondUserNumber) > countDigits(firstUserNumber)){
            return secondUserNumber;
        } else {
            return 0;
        }
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
