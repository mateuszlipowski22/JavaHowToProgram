package section_9.t9_8;

public class Main {
    public static void main(String[] args) {

        Quadrilateral quadrilateral = new Quadrilateral(new Point(1,1),
                new Point(1,3),
                new Point(3,3),
                new Point(3,1));

        System.out.println("quadrilateral.getCircumference() = " + quadrilateral.getCircumference());
        System.out.println("quadrilateral.getArea() = " + quadrilateral.getArea());
    }
}
