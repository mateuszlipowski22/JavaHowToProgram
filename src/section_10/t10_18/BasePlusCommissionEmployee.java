package section_10.t10_18;

public class BasePlusCommissionEmployee extends Employee {

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                                      BasePlusCommissionCompensationModel compensationModel){
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
