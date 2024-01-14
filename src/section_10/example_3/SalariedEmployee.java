package section_10.example_3;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        if(weeklySalary<0.0){
            throw new IllegalArgumentException("Tygodniowe wynagrodzenie musi być > od 0.0");
        }
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if(weeklySalary<0.0){
            throw new IllegalArgumentException("Tygodniowe wynagrodzenie musi być > od 0.0");
        }
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double earnings() {
        return getWeeklySalary();
    }

    @Override
    public String toString() {
        return String.format("pracownik ze stałym wynagrodzeniem : %s%n%s: %,.2f pln",
                super.toString(),"wynagrodzenie tygodniowe", earnings());
    }
}
