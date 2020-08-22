/*
Заданы размеры А, В прямоугольного отверстия и размеры x, y, z кирпича.
Определить, пройдет ли кирпич через отверстие.
 */
package basicsOfSoftwareCodeDevelopment.branching.Task4;

public class InsertTheBrickIntiTheHole {
    public static boolean brickAndHoleMatch;

    public static boolean putABrick (Brick brick, Hole hole) {

        if (brick.getLength() <= hole.getLength() && brick.getHeight() <= hole.getHeight()) brickAndHoleMatch = true;
        else brickAndHoleMatch = brick.getLength() <= hole.getLength() && brick.getWidth() <= hole.getHeight();

        return brickAndHoleMatch;
    }
}
