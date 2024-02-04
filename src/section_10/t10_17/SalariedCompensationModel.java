package section_10.t10_17;

public class SalariedCompensationModel implements CompensationModel {
    private double weeklySalary;

    public SalariedCompensationModel(double weeklySalary) {
        if(weeklySalary<=0.0){
            throw new IllegalArgumentException("Tygodniowe wynagrodzenie musi być > od 0.0");
        }
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if(weeklySalary<=0.0){
            throw new IllegalArgumentException("Tygodniowe wynagrodzenie musi być > od 0.0");
        }
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double earnings(){
        return this.weeklySalary;
    }
}
