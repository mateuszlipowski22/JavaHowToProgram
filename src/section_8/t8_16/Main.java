package section_8.t8_16;

public class Main {
    public static void main(String[] args) {
        Rational rational = new Rational(1,8);
        System.out.println("rational = " + rational);
        Rational rational2 = new Rational(3,7);
        System.out.println("rational2 = " + rational2);

        System.out.println("Rational.add(rational,rational2) = " + Rational.add(rational, rational2));
        System.out.println("Rational.subtract(rational,rational2) = " + Rational.subtract(rational, rational2));
        System.out.println("Rational.multiply(rational,rational2) = " + Rational.multiply(rational, rational2));
        System.out.println("Rational.divide(rational,rational2) = " + Rational.divide(rational, rational2));
        System.out.println("rational.text(2) = " + rational.text(3));
        System.out.println("rational.text() = " + rational.text());
    }
}
