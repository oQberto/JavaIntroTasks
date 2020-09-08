/*
Вычислить значения функции на отрезке [a, b], с шагом h:
if (x > 2) y = x;
if (x <= 2) y = -x;
 */
package by.jonline.module1.cycle.task2;

public class FunctionValue {
    public static int y;

    public static void findTheValueOfTheFunctionOnTheSegment (int a, int b, int step) {

        for (int i = a; i <= b; i += step) {
            if (i <= 2) y = -i;
            else y = i;
            System.out.println(y);
        }
    }
}
