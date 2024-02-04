package section_10.t10_14;

public class Rectangle extends TwoDimensionalShape {

    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    double getArea() {
        return a*b;
    }
}
