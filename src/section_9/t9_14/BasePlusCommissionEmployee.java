package section_9.t9_14;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                                      double grossSales, double commissionRate, double baseSalary) {
        super(firstName,  lastName,  socialSecurityNumber, grossSales,  commissionRate);


        this.baseSalary = baseSalary;
    }


    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary<0.0){
            throw new IllegalArgumentException("Wynagrodzenie zasadnicze musi być >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    public double earnings(){
        return baseSalary+(getCommissionRate()*getGrossSales());
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s %.2f",
                "otrzymujacy wynagrodzenie zasadnicze pracownik prowizyjny",
                getFirstName(), getLastName(),
                "numer ubezpieczenia", getSocialSecurityNumber(),
                "łączna sprzedaż", getGrossSales(), "procent prowizji", getCommissionRate(),
                "wynagrodzenie zasadnicze", earnings());
    }
}
