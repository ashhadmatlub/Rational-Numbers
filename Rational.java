package Rational;

public class Rational {
    private int numerator;
    private int denominator;

    // Null Cons
    public Rational() {
        this.denominator = 1;
        this.numerator = 1;
    }

    // Para Cons
    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // Copy Cons
    public Rational(Rational other) {
        this.denominator = other.denominator;
        this.numerator = other.numerator;
    }

    // Getter and Setters
    public void setNum(int numerator) {
        this.numerator = numerator;
    }

    public void setDen(int denominator) {
        this.denominator = denominator;
    }

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    // Method to add Rational number
    public int addRatNum() {
        int sum = this.numerator + this.denominator;
        return sum;
    }

    // Method to Subtract Rational number
    public int subRatNum() {
        int sub = this.numerator - this.denominator;
        return sub;
    }

    // Multiply
    public int mulRatNum() {
        int mul = this.numerator * this.denominator;
        return mul;
    }

    // Divide
    public double divRatNum() {
        double div = this.numerator / this.denominator;
        return div;
    }

    // greatest common diviser
    public int GCD(int numerator, int denominator) {
        while (denominator != 0) {
            int temp = denominator;
            denominator = numerator % denominator;
            numerator = temp;
        }
        return numerator;
    }

    // Function to calculate LCM
    public int lcm(int numerator, int denominator) {
        return (numerator * denominator) / GCD(numerator, denominator);
    }

    // toString

    @Override
    public String toString() {
        return "The Numerator is : " + numerator + " the Denominator is : " + denominator +
                "\n the sum of the Rational number is : " + addRatNum() +
                "\n by sub the Rational number ans is : " + subRatNum() +
                "\n Multiply : " + mulRatNum() +
                "\n Division : " + divRatNum() +
                "\n And the LCM of these numbers are Equal to : " + lcm(numerator, denominator);
    }
}
