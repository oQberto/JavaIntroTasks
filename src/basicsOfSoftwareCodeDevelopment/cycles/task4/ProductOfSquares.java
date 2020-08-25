/*
Составить программу для нахождения произведения квадратов первых двухсот чисел.
 */
package basicsOfSoftwareCodeDevelopment.cycles.task4;

import java.math.BigInteger;

public class ProductOfSquares {
    static BigInteger big = new BigInteger("1");


    public static BigInteger calculateProductOfSquares () {
        for (int i = 1; i <= 200; i++) {
            big = big.multiply(BigInteger.valueOf((long) Math.pow(i, 2)));
        }
        return big;
    }
}
