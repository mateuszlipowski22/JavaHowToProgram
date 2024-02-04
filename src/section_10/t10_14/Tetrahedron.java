package section_10.t10_14;

public class Tetrahedron extends ThreeDimensionalShape {

    private int a;

    public Tetrahedron(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    @Override
    double getArea() {
        return Math.sqrt(3)*this.a*this.a;
    }

    @Override
    public double getVolume() {
        return Math.pow(this.a,3)/(6*Math.sqrt(2));
    }
}
