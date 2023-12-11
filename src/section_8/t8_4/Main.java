package section_8.t8_4;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(10);
        rectangle.setWidth(20);
        System.out.println("rectangle.getCircuit() = " + rectangle.getCircuit());
        System.out.println("rectangle.getArea() = " + rectangle.getArea());
    }
}
