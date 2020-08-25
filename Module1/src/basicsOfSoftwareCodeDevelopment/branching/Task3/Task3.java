/*
Даны три точки A(x1, y1), B(x2, y2), C(x3, y3).
Определить, будут ли они расположены на одной прямой.
 */
package basicsOfSoftwareCodeDevelopment.branching.Task3;

public class Task3 {

    public static boolean findThePoints (CreatePoint point1, CreatePoint point2, CreatePoint point3) {
        return ((point2.getX() - point1.getX()) * (point3.getY() - point1.getY()))
                - ((point3.getX() - point1.getX()) * (point2.getY() - point1.getY())) == 0;
    }
}