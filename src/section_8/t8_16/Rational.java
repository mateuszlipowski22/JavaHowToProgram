package section_8.t8_16;

public class Rational {
    private long numerator;
    private long denominator;

    public Rational() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Rational(long numerator, long denominator) {
        long HCD = getHCD(Math.abs(numerator), Math.abs(denominator));
        this.numerator = numerator/HCD;
        this.denominator = denominator/HCD;
    }

    private long getHCD(long numerator, long denominator){
        while(numerator!=denominator){
            if(numerator>denominator)
                numerator-=denominator; //lub a = a - b;
            else
                denominator-=numerator; //lub b = b-a
        }
        return numerator;
    }

    @Override
    public String toString() {
        return String.format("%d/%d",numerator,denominator);
    }

    public static Rational add(Rational rational1, Rational rational2){
        return new Rational(rational1.numerator*rational2.denominator+rational2.numerator*rational1.denominator,
                rational1.denominator*rational2.denominator);
    }

    public static Rational subtract(Rational rational1, Rational rational2){
        return new Rational(rational1.numerator*rational2.denominator
                -rational2.numerator*rational1.denominator,
                rational1.denominator*rational2.denominator);
    }

    public static Rational multiply(Rational rational1, Rational rational2){
        return new Rational(rational1.numerator*rational2.numerator,
                rational1.denominator*rational2.denominator);
    }

    public static Rational divide(Rational rational1, Rational rational2){
        return new Rational(rational1.numerator*rational2.denominator,
                rational1.denominator*rational2.numerator);
    }

    public String text(int number){
        String text = "%.numberf".replace("number",Integer.toString(number));
        return String.format(text, numerator/((float) denominator));
    }

    public String text(){
        return text(1);
    }
}
