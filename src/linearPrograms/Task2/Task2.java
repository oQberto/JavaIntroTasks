/*
Вычислить значения выражения по формуле (все переменные принимают действительные значения)
((b + √(b^2 + 4ac)) / 2a) - a^3 * c + b^(-2)
 */
package linearPrograms.Task2;

public class Task2 {
    public static double expressionValue (double a, double b, double c) {
        double squareRoot = Math.sqrt(Math.pow(b, 2) + 4 * a * c);
        if (squareRoot < 0) {
            System.out.println("Ошибка!");
        }
        return ((b + squareRoot) / 2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
    }
}
