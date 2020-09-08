package by.jonline.module1.branching.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExistenceOfATriangleTest {
    private final String TRIANGLE_EXIST = "Треугольник существует";
    private final String RECTANGULAR_TRIANGLE = "Треугольник существует и он прямоугольный";
    private final String NO_TRIANGLE = "Треугольник не существует";

    @Test
    void triangleExistWhenTwoAnglesSumBelow180 () {
        assertEquals(TRIANGLE_EXIST, ExistenceOfATriangle.triangleExists(45, 40));
    }

    @Test
    void triangleDoesNotExistWhenTwoAngleSumMore180 () {
        assertEquals(NO_TRIANGLE, ExistenceOfATriangle.triangleExists(91, 95));
    }

    @Test
    void triangleDoesNotExistWhenTwoAnglesSumIs0 () {
        assertEquals(NO_TRIANGLE, ExistenceOfATriangle.triangleExists(0, 0));
    }

    @Test
    void triangleDoesNotExistWhenFirstAngleIs0 () {
        assertEquals(NO_TRIANGLE, ExistenceOfATriangle.triangleExists(0, 30));
    }

    @Test
    void triangleDoesNotExistWhenSecondAngleIs0() {
        assertEquals(NO_TRIANGLE, ExistenceOfATriangle.triangleExists(60, 0));
    }

    @Test
    void triangleExistWhenTwoAnglesSumIs90 () {
        assertEquals(RECTANGULAR_TRIANGLE, ExistenceOfATriangle.triangleExists(45, 45));
    }

    @Test
    void triangleExistWhenFirstAngleRight () {
        assertEquals(RECTANGULAR_TRIANGLE, ExistenceOfATriangle.triangleExists(90, 45));
    }

    @Test
    void triangleExistWhenSecondAngleRight () {
        assertEquals(RECTANGULAR_TRIANGLE, ExistenceOfATriangle.triangleExists(30, 90));
    }
}