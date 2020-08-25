package basicsOfSoftwareCodeDevelopment.branching.Task4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertTheBrickIntiTheHoleTest {
    private Brick brick;
    private Brick brick1;

    private Hole hole;

    @BeforeEach
    void createBrickAndHole () {
        brick = new Brick(4, 5, 6);
        brick1 = new Brick(100, 100, 100);

        hole = new Hole(5, 7);
    }

    @Test
    void brickSuitableForHeightAndLength () {
        assertTrue(InsertTheBrickIntiTheHole.putABrick(brick, hole));
    }

    @Test
    void brickSuitableForWeightAndHeight() {
        assertTrue(InsertTheBrickIntiTheHole.putABrick(brick, hole));
    }

    @Test
    void brickDoesNotFitTheHole () {
        assertFalse(InsertTheBrickIntiTheHole.putABrick(brick1, hole));
    }

}