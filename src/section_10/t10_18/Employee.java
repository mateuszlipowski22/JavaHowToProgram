package section_10.t10_18;

public class Employee implements Payable{
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    private CompensationModel compensationModel;

    public Employee(String firstName, String lastName, String socialSecurityNumber, CompensationModel compensationModel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.compensationModel = compensationModel;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public CompensationModel getCompensationModel() {
        return compensationModel;
    }

    public double earnings(){
        return compensationModel.earnings();
    }

    @Override
    public double getPaymentAmount() {
        return earnings();
    }
}
