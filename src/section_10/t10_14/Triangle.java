package section_10.t10_14;

public class Triangle extends TwoDimensionalShape {
    private int a;
    private int h;

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }

    public int getA() {
        return a;
    }

    public int getH() {
        return h;
    }

    @Override
    double getArea() {
        return a*h*0.5;
    }
}
