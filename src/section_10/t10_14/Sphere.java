package section_10.t10_14;

public class Sphere extends ThreeDimensionalShape {

    private int r;

    public Sphere(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    @Override
    double getArea() {
        return 4*Math.PI*this.r*this.r;
    }

    @Override
    public double getVolume() {
        return 4/3d*Math.PI*Math.pow(this.r,3);
    }
}
