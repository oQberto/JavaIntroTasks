package basicsOfSoftwareCodeDevelopment.branching.Task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void findThePoints() {
        assertTrue(Task3.findThePoints(new CreatePoint(1, 1), new CreatePoint(3, 3), new CreatePoint(4, 4)));
        assertTrue(Task3.findThePoints(new CreatePoint(1.5, 1.5), new CreatePoint(3.5, 3.5), new CreatePoint(4.5, 4.5)));
        assertFalse(Task3.findThePoints(new CreatePoint(1, 2), new CreatePoint(2, 5), new CreatePoint(3, 7)));
        assertTrue(Task3.findThePoints(new CreatePoint(1, 1), new CreatePoint(1, 2), new CreatePoint(1, 3)));
        assertTrue(Task3.findThePoints(new CreatePoint(1, 0), new CreatePoint(2, 0), new CreatePoint(3, 0)));
    }
}