package basicsOfSoftwareCodeDevelopment.branching.Task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void finalSolution() {
        assertEquals("Треугольник существует и он прямоугольный", Task1.triangleExists(90, 45));
        assertEquals("Треугольник существует", Task1.triangleExists(31, 65));
        assertEquals("Треугольник не существует", Task1.triangleExists(0, 0));
        assertEquals("Треугольник не существует", Task1.triangleExists(1, 179));
        assertEquals("Треугольник не существует", Task1.triangleExists(54, 157));
    }
}