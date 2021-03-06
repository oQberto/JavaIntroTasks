/*
Вычислить значения выражения по формуле (все переменные принимают действительные значения)
((b + √(b^2 + 4ac)) / 2a) - a^3 * c + b^(-2)
 */
package by.jonline.module1.linear_program.task2;

public class Task2 {
    public static double expressionValue (double a, double b, double c) {
        double finalValue;
        double squareRoot = Math.sqrt(Math.pow(b, 2) + 4 * a * c);

        if (squareRoot < 0) {
            finalValue = Double.NaN;
        }
        else {
            finalValue = ((b + squareRoot) / (2 * a)) - Math.pow(a, 3) * c + Math.pow(b, -2);
        }
        return finalValue;
    }
}