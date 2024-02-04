package section_10.t10_16;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                                      double grossSales, double commissionRate, double baseSalary) {
        super(firstName,  lastName,  socialSecurityNumber, grossSales,  commissionRate);

        if(baseSalary<0.0){
            throw new IllegalArgumentException("Wynagrodzenie zasadnicze musi być >= 0.0");
        }
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
        return getBaseSalary()+super.earnings();
    }

    @Override
    public String toString() {
        return String.format("%s %s; %s: %,.2f pln",
                "otrzymujacy wynagrodzenie zasadnicze",
                super.toString(),
                "wynagrodzenie zasadnicze", getBaseSalary());
    }
}
