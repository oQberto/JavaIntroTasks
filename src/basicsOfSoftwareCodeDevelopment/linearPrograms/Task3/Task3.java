/*
Вычислить значение выражения по формуле (все переменные принимают действительные значения):
((sin x + cos y) / (cos x - sin y)) * tg xy
 */
package basicsOfSoftwareCodeDevelopment.linearPrograms.Task3;

public class Task3 {
    public static double trigonometricExpression (double x, double y) {
        double x2Radians = Math.toRadians(x);
        double y2Radians = Math.toRadians(y);

        return ((Math.sin(x2Radians) + Math.cos(y2Radians)) / (Math.cos(x2Radians) - Math.sin(y2Radians))) * Math.tan(x2Radians * y2Radians);
    }
}

