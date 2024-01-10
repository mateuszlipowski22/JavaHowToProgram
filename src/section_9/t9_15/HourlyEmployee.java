package section_9.t9_15;

public class HourlyEmployee extends Employee{
    private int hours;
    private double wage;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, int hours, double wage) {
        super(firstName, lastName, socialSecurityNumber);
        this.hours = hours;
        this.wage = wage;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if(hours>0 && hours<168){
            this.hours = hours;
        }else {
            this.hours = 0;
        }
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public double earnings() {
        return hours>40 ? ((hours-40)*1.5+40)*wage : hours*wage;
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %d%n%s: %.2f%n%s %.2f",
                "pracownik godzinowy",
                getFirstName(), getLastName(),
                "numer ubezpieczenia", getSocialSecurityNumber(),
                "przepracowane godziny", getHours(), "stawka godzinowa", getWage(),
                "wynagrodzenie zasadnicze", earnings());
    }
}
