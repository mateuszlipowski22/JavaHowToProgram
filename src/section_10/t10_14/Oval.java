package section_10.t10_14;

public class Oval extends TwoDimensionalShape {
    private int a;
    private int b;

    public Oval(int a, int b) {
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
        return Math.PI*a*b;
    }
}
