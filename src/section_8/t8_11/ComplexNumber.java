package section_8.t8_11;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber() {
        this.real = 0;
        this.imaginary = 0;
    }

    public void add(ComplexNumber complexNumber){
        this.real+=complexNumber.real;
        this.imaginary+=complexNumber.imaginary;
    }

    public void subtract(ComplexNumber complexNumber){
        this.real-=complexNumber.real;
        this.imaginary-=complexNumber.imaginary;
    }

    public static ComplexNumber addTwoNumber(ComplexNumber first, ComplexNumber second){
        return new ComplexNumber(first.real+second.real,first.imaginary+second.imaginary);
    }

    public static ComplexNumber subtractTwoNumber(ComplexNumber first, ComplexNumber second){
        return new ComplexNumber(first.real-second.real,first.imaginary-second.imaginary);
    }


    @Override
    public String toString() {
        return String.format("%.2f + %.2f*i",real,imaginary);
    }
}
