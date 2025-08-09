package Rational;

public class Main {
    public static void main(String[] args) {
        // Null Cons
        Rational R1 = new Rational();
        System.out.println(R1);

        // Para Cons
        Rational R2 = new Rational(5, 7);
        System.out.println(R2);

        // Copy Cons
        Rational R3 = new Rational(R2);
        System.out.println(R3);

        // Checking Setters
        R3.setNum(2);
        R3.setDen(10);
        System.out.println(R3);

    }
}
