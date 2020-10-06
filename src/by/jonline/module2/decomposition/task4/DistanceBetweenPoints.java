/*
На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
 */
package by.jonline.module2.decomposition.task4;

import java.util.*;

public class DistanceBetweenPoints {

    public static void main(String[] args) {
        CreatePoint[] createPoints = {new CreatePoint("A", 1, 2), new CreatePoint("B", 3, 4), new CreatePoint("C", 5, 6), new CreatePoint("D", 7, 8)};

        System.out.println(determineTheDistanceBetweenTwoPoints(createPoints));
    }

    public static Map<String, Double> determineTheDistanceBetweenTwoPoints(CreatePoint[] createPoints) {
        Map<String, Double> hashMap = new TreeMap<>();

        for (int i = 0; i < createPoints.length; i++) {
            for (int j = 1; j < createPoints.length; j++) {
                if (j == i) {
                    continue;
                }

                double distance = Math.sqrt(Math.pow((createPoints[j].getX() - createPoints[i].getX()), 2)
                        + Math.pow((createPoints[j].getY() - createPoints[i].getY()), 2));

                hashMap.put(createPoints[i].getName() + createPoints[j].getName() + " ", distance);

                hashMap.entrySet().removeIf(entry -> entry.getValue() == 0);
            }
        }
        return hashMap;
    }
}