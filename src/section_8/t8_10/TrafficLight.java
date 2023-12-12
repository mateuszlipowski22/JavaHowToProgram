package section_8.t8_10;

public enum TrafficLight {
    RED(20),
    GREEN(15),
    YELLOW(5);

    private final int length;

    TrafficLight(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
