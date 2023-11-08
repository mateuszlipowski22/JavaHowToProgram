package section_4.t4_17;

public class PetrolConsumption {

    private int distance;
    private int fuelVolume;

    private double averageConsumption;

    public PetrolConsumption(int distance, int fuelVolume) {
        this.distance = distance;
        this.fuelVolume = fuelVolume;
        this.averageConsumption=  fuelVolume / ((double) distance) *100;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getFuelVolume() {
        return fuelVolume;
    }

    public void setFuelVolume(int fuelVolume) {
        this.fuelVolume = fuelVolume;
    }

    @Override
    public String toString() {
        return "PetrolConsumption{" +
                "distance=" + distance +
                ", fuelVolume=" + fuelVolume +
                ", averageConsumption=" + averageConsumption +
                '}';
    }
}
