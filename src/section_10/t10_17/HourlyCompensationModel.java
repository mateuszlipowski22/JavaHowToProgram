package section_10.t10_17;

public class HourlyCompensationModel implements CompensationModel {
    private double hours;
    private double wage;

    public HourlyCompensationModel(double hours, double wage) {
        if (hours < 0 || hours > 168) {
            throw new IllegalArgumentException("Liczba przepracowanych godzin  musi być >= od 0.0 i <=168");
        }
        if (wage <= 0.0) {
            throw new IllegalArgumentException("Stawka godzinowa musi być > od 0.0");
        }
        this.wage = wage;
        this.hours = hours;
    }

    public double getHours() {
        return hours;
    }

    public double getWage() {
        return wage;
    }

    @Override
    public double earnings(){
        return getHours() > 40 ? ((getHours() - 40) * 1.5 + 40) * getWage() : getHours() * getWage();
    }
}
