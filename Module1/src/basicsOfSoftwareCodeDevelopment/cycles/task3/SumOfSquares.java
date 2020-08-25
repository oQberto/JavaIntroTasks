/*
Найти сумм квадратов первых ста чисел.
 */
package basicsOfSoftwareCodeDevelopment.cycles.task3;

public class SumOfSquares {
    private static int finalValue;

    public static int calculateTheSumOfSquares () {
        for (int i = 0; i <= 100; i++) {
            finalValue += Math.pow(i, 2);
        }
        return finalValue;
    }
}
