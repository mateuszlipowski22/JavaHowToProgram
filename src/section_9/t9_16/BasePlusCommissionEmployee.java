package section_9.t9_16;

public class BasePlusCommissionEmployee extends Employee {

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                                      CompensationModel compensationModel){
        super(firstName,  lastName,  socialSecurityNumber, compensationModel);
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f",
                "otrzymujacy wynagrodzenie zasadnicze pracownik prowizyjny",
                getFirstName(), getLastName(),
                "numer ubezpieczenia", getSocialSecurityNumber(),
                "wynagrodzenie zasadnicze", earnings());
    }
}
