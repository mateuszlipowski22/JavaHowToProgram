package section_6.t6_8;

public class ParkingCost {
    private double hour;

    public ParkingCost(double hour) {
        this.hour = hour;
    }

    public double getHour() {
        return hour;
    }

    public double getCost(){
        double result;
        if(this.hour<=3){
            result = 2 ;
        }else if(this.hour>3 && this.hour<=24){
            result = 2+(Math.ceil(this.hour)-3)*0.5;
        }else {
            result=10;
        }
        return result;
    }

    @Override
    public String toString() {
        return String.format("Ilość godzin : %.0f Koszt %.2f %n",getHour(), getCost());
    }
}
