package section_14.t_14_20;

public class Main {
    public static void main(String[] args) {

        CheckValue checkValue = new CheckValue(12.2d);
        checkValue.printValue();

        CheckValue checkValue2 = new CheckValue("12.2");
        checkValue2.printValue();
    }
}
