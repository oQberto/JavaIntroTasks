/*
Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
если угол между сторонами длиной X и Y— прямой.
 */

package by.jonline.module2.decomposition.task9;

public class AreaOfAQuadrangle {

    public static double findTheAreaOfAQuadrangle(int x, int y, int z, int t) {
        int semi_perimeter = calculateSemi_Perimeter( x, y, z, t);

        return Math.sqrt((semi_perimeter - x) * (semi_perimeter - y) * (semi_perimeter - z) * (semi_perimeter - t));
    }

    private static int calculateSemi_Perimeter(int x, int y, int z, int t) {
        return (x + y + z + t) / 2;
    }
}
