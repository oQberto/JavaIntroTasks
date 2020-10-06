package by.jonline.module2.decomposition.task9;

import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class AreaOfAQuadrangleTest {

    @Test
    void findTheAreaOfAQuadrangle() {
        DecimalFormat decimalFormat = new DecimalFormat("###.###");
        String expected = "4,899";

        assertEquals(expected, decimalFormat.format(AreaOfAQuadrangle.findTheAreaOfAQuadrangle(1, 2, 3, 4)));
    }
}