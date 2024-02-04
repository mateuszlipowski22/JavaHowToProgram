package section_10.t10_17;

public class SalariedEmployee extends Employee {

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, SalariedCompensationModel compensationModel) {
        super(firstName, lastName, socialSecurityNumber, compensationModel);
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f",
                "pracownik stałym wynagrodzeniem",
                getFirstName(), getLastName(),
                "numer ubezpieczenia", getSocialSecurityNumber(),
                "zarobek", earnings());
    }
}
