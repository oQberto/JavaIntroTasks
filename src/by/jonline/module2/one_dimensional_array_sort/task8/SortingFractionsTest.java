package by.jonline.module2.one_dimensional_array_sort.task8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortingFractionsTest {

    @Test
    void outputArray() {

        Fraction[] array = new Fraction[]
                {new Fraction(4, 5), new Fraction(1, 8), new Fraction(4, 10)};

        Fraction[] expected = new Fraction[]{};
        SortingFractions.outputArray(array);
    }

    @Test
    void sortArray() {
        Fraction[] array = new Fraction[]
                {new Fraction(4, 5), new Fraction(1, 8), new Fraction(4, 10)};

        Fraction[] expected = new Fraction[]
                {new Fraction(5, 40), new Fraction(16, 40), new Fraction(32,40)};

        assertArrayEquals(expected, SortingFractions.sortArray(array));
    }

    @Test
    void findLeastCommonMultiple() {
        Fraction[] array = new Fraction[]
                {new Fraction(4, 5), new Fraction(1, 8), new Fraction(4, 10)};
        int expected = 40;

        assertEquals(expected, SortingFractions.findLeastCommonMultiple(array));
    }

    @Test
    void convertingToACommonDenominator() {
        Fraction[] array = new Fraction[]
                {new Fraction(4, 5), new Fraction(1, 8), new Fraction(4, 10)};

        Fraction[] expected = new Fraction[]
                {new Fraction(32, 40), new Fraction(5, 40), new Fraction(16, 40)};

        assertArrayEquals(expected, SortingFractions.convertingToACommonDenominator(array));
    }
}