/*
Даны два угла треугольника (в градусах). Определить существует ли такой треугольник и если да,
то будет ли он прямоугольным.
 */
package by.jonline.module1.branching.task1;

public class ExistenceOfATriangle {
    public static String isExists;
    private static final int TRIANGLE = 180;

    public static String triangleExists (double angle1, double angle2) {
        double angle3 = TRIANGLE - (angle1 + angle2);

        if (angle3 == 90 || angle1 == 90 || angle2 == 90) {
            isExists = "Треугольник существует и он прямоугольный";
        } else if (angle3 > 0 && angle3 != 0 && angle3 <= 180 && angle1 != 0 && angle2 != 0) {
            isExists = "Треугольник существует";
        } else {
            isExists = "Треугольник не существует";
        }
        return isExists;
    }
}