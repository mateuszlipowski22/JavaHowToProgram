package section_8.t8_11;

public class Main {
    public static void main(String[] args) {
        ComplexNumber complexNumber1 = new ComplexNumber(5,8);
        System.out.println("complexNumber1 = " + complexNumber1);
        ComplexNumber complexNumber2 = new ComplexNumber(2,9);
        System.out.println("complexNumber2 = " + complexNumber2);
        System.out.println("ComplexNumber.addTwoNumber(complexNumber1,complexNumber2) = " + ComplexNumber.addTwoNumber(complexNumber1, complexNumber2));
        System.out.println("ComplexNumber.subtractTwoNumber(complexNumber1,complexNumber2) = " + ComplexNumber.subtractTwoNumber(complexNumber1, complexNumber2));
    }
}
