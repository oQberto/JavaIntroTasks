/*
Составить программу для нахождения произведения квадратов первых двухсот чисел.
 */
package by.jonline.module1.cycle.task4;

public class CompositionOfSquares {
    private static int composition = 1;

    public static int calculateProductOfSquares () {

        for (int i = 1; i <= 200; i++) {
            composition *= Math.pow(i, 2);

            if (composition == Integer.MAX_VALUE) {
                break;
            }
        }

        return composition;
    }
}
