package section_9.t9_16;

public class Main {
    public static void main(String[] args) {
        Employee commissionEmployee = new CommissionEmployee("Adam", "Nowak", "11223344",new CommissionCompensationModel(30,133));
        System.out.println("commissionEmployee = " + commissionEmployee);
        System.out.println();

        Employee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Michal", "Nowak", "11223344",new BasePlusCommissionCompensationModel(1000,30,133));
        System.out.println("commissionEmployee = " + basePlusCommissionEmployee);
        System.out.println();
    }
}
