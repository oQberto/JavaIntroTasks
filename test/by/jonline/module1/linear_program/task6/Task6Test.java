package by.jonline.module1.linear_program.task6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task6Test {
    @Test
    void locationCheck() {
        assertTrue(Task6.locationCheck(-3, -2));
        assertFalse(Task6.locationCheck(3, -5));
        assertTrue(Task6.locationCheck(0, 3));
        assertTrue(Task6.locationCheck(0, 0));
    }

    @Test
    void zone1Check() {
        assertTrue(Task6.zone1Check(-3, -2));
        assertFalse(Task6.zone1Check(3, -5));
        assertFalse(Task6.zone1Check(0, 3));
        assertTrue(Task6.zone1Check(0, 0));
    }

    @Test
    void zone2Check() {
        assertFalse(Task6.zone2Check(-3, -2));
        assertFalse(Task6.zone2Check(3, -5));
        assertTrue(Task6.zone2Check(0, 3));
        assertTrue(Task6.zone2Check(0, 0));
    }

}