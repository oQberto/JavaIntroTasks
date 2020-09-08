/*
Для данной области составить линейнуб программу, которая печатает true, если точка с координатами (х, у)
принадлежит закрашенной области, и false - в противном случае.
 */
package by.jonline.module1.linear_program.task6;

public class Task6 {
    private static boolean isAlive;

    public static boolean locationCheck (double x, double y) {
        if (x <= -2 || x >= 2) zone1Check(x, y);
        else zone2Check(x, y);
        return isAlive;
    }

    public static boolean zone1Check (double x, double y) {
        isAlive = x >= -4 && x <= 4 && y >= -3 && y <= 0;
        return isAlive;
    }

    public static boolean zone2Check (double x, double y) {
        isAlive = x >= -2 && x <= 2 && y >= 0 && y <= 4;
        return isAlive;
    }
}
