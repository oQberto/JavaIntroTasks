/*
Вычислить значение выражения по формуле (все переменные принимают действительные значения):
((sin x + cos y) / (cos x - sin y)) * tg xy
 */
package by.jonline.module1.linear_program.task3;

public class Task3 {
    static double x2Radians;
    static double y2Radians;

    public static double trigonometricExpression (double x, double y) {
        x2Radians = Math.toRadians(x);
        y2Radians = Math.toRadians(y);

        return ((Math.sin(x2Radians) + Math.cos(y2Radians)) / (Math.cos(x2Radians) - Math.sin(y2Radians))) * Math.tan(x2Radians * y2Radians);
    }
}

