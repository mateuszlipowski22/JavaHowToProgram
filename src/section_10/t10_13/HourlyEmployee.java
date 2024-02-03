package section_10.t10_13;

public class HourlyEmployee extends Employee {
    private double hours;
    private double wage;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthDate, double hours, double wage) {
        super(firstName, lastName, socialSecurityNumber, birthDate);
        if (wage <= 0.0) {
            throw new IllegalArgumentException("Stawka godzinowa musi być > od 0.0");
        }
        if (hours < 0 || hours > 168) {
            throw new IllegalArgumentException("Liczba przepracowanych godzin  musi być >= od 0.0 i <-168");
        }
        this.hours = hours;
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours < 0 || hours > 168) {
            throw new IllegalArgumentException("Liczba przepracowanych godzin  musi być >= od 0.0 i <-168");
        }
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage <= 0.0) {
            throw new IllegalArgumentException("Stawka godzinowa musi być > od 0.0");
        }
        this.wage = wage;
    }

    @Override
    public double earnings() {
        return getHours() > 40 ? ((getHours() - 40) * 1.5 + 40) * getWage() : getHours() * getWage();
    }

    @Override
    public String toString() {
        return String.format("pracownik z wynagrodzeniem godzinowym : %s%n%s: %,.2f %s : %,.2f",
                super.toString(),
                "stawka godzinowa", getWage(),"liczba przepracowanych godzin", getHours());
    }
}
