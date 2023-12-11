package section_8.t8_4;

public class Rectangle {
    private double length = 1;
    private double width = 1;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length>0){
            this.length = length;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width>0){
            this.width = width;
        }
    }

    public double getArea(){
        return length*width;
    }

    public double getCircuit(){
        return 2*(length+width);
    }
}
