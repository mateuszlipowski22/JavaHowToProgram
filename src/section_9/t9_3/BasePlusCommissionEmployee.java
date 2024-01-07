package section_9.t9_3;

public class BasePlusCommissionEmployee {
    private CommissionEmployee commissionEmployee;
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                                      double grossSales, double commissionRate, double baseSalary) {

        this.commissionEmployee = new CommissionEmployee(firstName,lastName,socialSecurityNumber,
                grossSales, commissionRate);

        this.baseSalary = baseSalary;
    }

    public String getFirstName() {
        return commissionEmployee.getFirstName();
    }

    public String getLastName() {
        return commissionEmployee.getLastName();
    }

    public String getSocialSecurityNumber() {
        return commissionEmployee.getSocialSecurityNumber();
    }

    public double getGrossSales() {
        return commissionEmployee.getGrossSales();
    }

    public double getCommissionRate() {
        return commissionEmployee.getCommissionRate();
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setGrossSales(double grossSales) {
        commissionEmployee.setGrossSales(grossSales);
    }

    public void setCommissionRate(double commissionRate) {
        commissionEmployee.setCommissionRate(commissionRate);
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary<0.0){
            throw new IllegalArgumentException("Wynagrodzenie zasadnicze musi być >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    public double earnings(){
        return baseSalary+(commissionEmployee.getCommissionRate()*commissionEmployee.getGrossSales());
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s %.2f",
                "otrzymujacy wynagrodzenie zasadnicze pracownik prowizyjny",
                commissionEmployee.getFirstName(), commissionEmployee.getLastName(),
                "numer ubezpieczenia", commissionEmployee.getSocialSecurityNumber(),
                "łączna sprzedaż", commissionEmployee.getGrossSales(), "procent prowizji", commissionEmployee.getCommissionRate(),
                "wynagrodzenie zasadnicze", earnings());
    }
}
