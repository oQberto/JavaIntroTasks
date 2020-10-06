/*
Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
треугольника.
 */

package by.jonline.module2.decomposition.task3;

public class AreaOfAHexagon {

    public static double findTheAreaOfHexagon(int sideOfTheHexagon) {
        return findTheAreaOfATriangle(sideOfTheHexagon) * 6;
    }

    protected static double findTheAreaOfATriangle(double sideOfTheHexagon) {
        return sideOfTheHexagon / 2 * findTheRadiusOfTheInscribedCircle(sideOfTheHexagon);
    }

    protected static double findTheRadiusOfTheInscribedCircle(double sideOfTheHexagon) {
        return Math.sqrt(3) / 2 * sideOfTheHexagon;
    }
}