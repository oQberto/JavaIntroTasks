/*
Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
площади, периметра и точки пересечения медиан.
 */
package by.jonline.module4.simplest_class_and_object.task7;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    Triangle(Point a, Point b, Point c) {
        if (triangleExist(a, b, c)) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    public Point medianIntersectionPoint(Point a, Point b, Point c) {
        return new Point(((a.getX() + b.getX() + c.getX()) / 3), ((a.getY() + b.getY() + c.getY()) / 3));
    }

    public double findArea(Point a, Point b, Point c) {
        double semiPerimeter = findPerimeter(a, b, c) / 2;
        return Math.sqrt(semiPerimeter *
                (semiPerimeter - a.distanceBetweenPoints(b)) *
                (semiPerimeter - b.distanceBetweenPoints(c)) *
                (semiPerimeter - c.distanceBetweenPoints(a)));
    }

    public double findPerimeter(Point a, Point b, Point c) {
        return a.distanceBetweenPoints(b) + b.distanceBetweenPoints(c) + c.distanceBetweenPoints(a);
    }

    private boolean triangleExist(Point a, Point b, Point c) {
        if (!(zeroCoordinate(a)) || !(zeroCoordinate(b)) || !(zeroCoordinate(c))) {
            return false;
        } else return a.distanceBetweenPoints(b) + b.distanceBetweenPoints(c) > a.distanceBetweenPoints(c) &&
                a.distanceBetweenPoints(b) + a.distanceBetweenPoints(c) > b.distanceBetweenPoints(c) &&
                b.distanceBetweenPoints(c) + a.distanceBetweenPoints(c) > a.distanceBetweenPoints(b);
    }

    private boolean zeroCoordinate(Point point) {
        return point.distanceBetweenPoints(point) != 0;
    }
}

class Point {
    private int X;
    private int Y;

    Point(int x, int y) {
        this.X = x;
        this.Y = y;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public void setX(int x) {
        X = x;
    }

    public void setY(int y) {
        Y = y;
    }

    public double distanceBetweenPoints(Point point) {
        double temp = Math.pow(point.getX() - X, 2);
        temp += Math.pow(point.getY() - Y, 2);
        return Math.sqrt(temp);
    }
}