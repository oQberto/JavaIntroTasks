package basicsOfSoftwareCodeDevelopment.linearPrograms.Task5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    void calculateTime() {
        assertEquals("00:01:03", Task5.calculateTime(63));
        assertEquals("01:00:00", Task5.calculateTime(3600));
        assertEquals("00:00:00", Task5.calculateTime(0));
    }
}