/*
Даны дроби p1/q1, p2/q2, ..., pi/qi (pi qi, - натуральные). Составить программу, которая приводит эти дроби к общему
знаменателю и упорядочивает их в порядке возрастания.
 */

package by.jonline.module2.one_dimensional_array_sort.task8;

public class SortingFractions {

    public static void outputArray(Fraction[] array) {
        sortArray(array);
        for(Fraction f : array) {
            System.out.print(f + " ");
        }
    }

    protected static Fraction[] convertingToACommonDenominator(Fraction[] array) {
        int additionalFactor;

        for (int i = 0; i < array.length; i++) {
            additionalFactor = findLeastCommonMultiple(array) / array[i].getDenominator();
            array[i] = new Fraction(additionalFactor * array[i].getNumerator(), findLeastCommonMultiple(array));
        }

        return array;
    }

    protected static int findLeastCommonMultiple(Fraction[] array) {
        int lcm = Fraction.lcm(array[0].getDenominator(), array[1].getDenominator());

        for (int i = 2; i < array.length; i++) {
            lcm = Fraction.lcm(lcm, array[i].getDenominator());
        }

        return lcm;
    }

    protected static Fraction[] sortArray(Fraction[] array) {
        convertingToACommonDenominator(array);

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j].toDouble() > array[j + 1].toDouble()) {
                    Fraction temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}