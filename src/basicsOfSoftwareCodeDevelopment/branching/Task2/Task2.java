/*
Найти max {min(a, b), min(c, d)}
 */
package basicsOfSoftwareCodeDevelopment.branching.Task2;

public class Task2 {
    public static double findMax (double a, double b, double c, double d) {
        return Math.max(Math.min(a, b), Math.min(c, d));
    }
}