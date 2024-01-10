package section_9.t9_8;

public class Quadrilateral {
    private Point A;
    private Point B;
    private Point C;
    private Point D;

    public Quadrilateral(Point a, Point b, Point c, Point d) {
        A = a;
        B = b;
        C = c;
        D = d;
    }

    public Point getA() {
        return A;
    }

    public void setA(Point a) {
        A = a;
    }

    public Point getB() {
        return B;
    }

    public void setB(Point b) {
        B = b;
    }

    public Point getC() {
        return C;
    }

    public void setC(Point c) {
        C = c;
    }

    public Point getD() {
        return D;
    }

    public void setD(Point d) {
        D = d;
    }

    public double getArea() {
//        A = (1/2) ⋅ {(x1y2 + x2y3 + x3y4 + x4y1) - (x2y1 + x3y2 + x4y3 + x1y4)}
        return 0.5d * ((A.getX() * B.getY() + B.getX() * C.getY() + C.getX() * D.getY() + D.getX() * A.getY()) -
                (B.getX() * A.getY() + C.getX() * B.getY() + D.getX() * C.getY() + A.getX() * D.getY()));
    }

    public double getSideLength(Point a, Point b) {
        return Math.sqrt(Math.pow((a.getX() - b.getX()),2)+Math.pow((a.getY() - b.getY()),2));
    }

    public double getCircumference(){
        return getSideLength(this.A,this.B)+getSideLength(this.B,this.C)+getSideLength(this.C,this.D)+getSideLength(this.D,this.A);
    }
}
