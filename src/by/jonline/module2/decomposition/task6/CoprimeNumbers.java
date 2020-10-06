package by.jonline.module2.decomposition.task6;

public class CoprimeNumbers {

    public static boolean numbersAreCoprime(int[] array) {
        return findGreatestCommonDivisor(array) == 1;
    }

    public static int findGreatestCommonDivisor(int[] array) {
        int gcd = gcd(array[0], array[1]);

        for (int i = 2; i < array.length; i++) {
            gcd = gcd(gcd, array[i]);
        }
        return gcd;
    }

    private static int gcd(int firstNumber, int secondNumber) {
        return secondNumber == 0 ? firstNumber : gcd(secondNumber, firstNumber % secondNumber);
    }
}
