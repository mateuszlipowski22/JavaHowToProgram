package section_10.t10_14;

public class Cube extends ThreeDimensionalShape {
    private int a;

    public Cube(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    @Override
    double getArea() {
        return 6*a*a;
    }

    @Override
    public double getVolume() {
        return a*a*a;
    }
}
