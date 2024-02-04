package section_10.t10_17;

public class HourlyEmployee extends Employee {

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, HourlyCompensationModel compensationModel) {
        super(firstName, lastName, socialSecurityNumber, compensationModel);
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f",
                "pracownik godzinowy",
                getFirstName(), getLastName(),
                "numer ubezpieczenia", getSocialSecurityNumber(),
                "zarobek", earnings());
    }
}
