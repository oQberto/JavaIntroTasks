package by.jonline.module2.one_dimensional_array_sort.task8;

public class Fraction {
    private final int numerator;
    private final int denominator;

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    Fraction (int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public double toDouble() {
        return (double) numerator / (double) denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    protected static int gcd(int numerator, int denominator) {
        return denominator == 0 ? numerator : gcd(denominator, numerator % denominator);
    }

    protected static int lcm(int numerator, int denominator) {
        return numerator / gcd(numerator, denominator) * denominator;
    }
}
