package section_8.t8_10;

public class Main {
    public static void main(String[] args) {

        for(TrafficLight trafficLight : TrafficLight.values()){
            System.out.printf("%s : %s %n",trafficLight.name(),trafficLight.getLength());
        }

    }
}
