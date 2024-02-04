package section_9.t9_16.t10_18;

public class CommissionEmployee extends Employee {

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                              CommissionCompensationModel compensationModel) {
        super(firstName,  lastName,  socialSecurityNumber, compensationModel);
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f",
                "pracownik prowizyjny",
                getFirstName(), getLastName(),
                "numer ubezpieczenia", getSocialSecurityNumber(),
                "zarobek", earnings());
    }
}
