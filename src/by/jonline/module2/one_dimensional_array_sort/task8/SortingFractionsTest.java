package by.jonline.module2.one_dimensional_array_sort.task8;

import by.jonline.module2.one_dimensional_array_sort.task8.Fraction;
import by.jonline.module2.one_dimensional_array_sort.task8.SortingFractions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortingFractionsTest {

    @Test
    void outputArray() {
        Fraction fraction = new Fraction(1, 2);
        Fraction fraction1 = new Fraction(1, 2);

        System.out.println(fraction.equals(fraction1));
    }

    @Test
    void sortArray() {
        Fraction[] array = new Fraction[]
                {new Fraction(4, 5), new Fraction(1, 8), new Fraction(4, 10)};

        Fraction[] expected = new Fraction[]
                {new Fraction(5, 40), new Fraction(16, 40), new Fraction(32,40)};

        Assertions.assertArrayEquals(expected, SortingFractions.sortArray(array));
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