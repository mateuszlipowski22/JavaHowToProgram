package section_10.t10_14;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(10));
        shapes.add(new Rectangle(10, 15));
        shapes.add(new Square(10));
        shapes.add(new Triangle(10,15));
        shapes.add(new Oval(10,15));
        shapes.add(new Cube(10));
        shapes.add(new Sphere(10));
        shapes.add(new Tetrahedron(10));

        shapes.forEach(shape ->{
            System.out.println(String.format("Surface area of %s is %.2f", shape.getClass().getSimpleName(), shape.getArea()));
            if(shape instanceof ThreeDimensionalShape instance){
                System.out.println(String.format("Volume of %s is %.2f", shape.getClass().getSimpleName(), instance.getVolume()));
            }
        });
    }

}
