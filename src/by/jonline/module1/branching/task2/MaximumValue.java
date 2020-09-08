/*
Найти max {min(a, b), min(c, d)}
 */
package by.jonline.module1.branching.task2;

public class MaximumValue {
    public static int findMax (int a, int b, int c, int d) {
        return Math.max(Math.min(a, b), Math.min(c, d));
    }
}