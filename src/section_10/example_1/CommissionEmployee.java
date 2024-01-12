package section_10.example_1;

public class CommissionEmployee extends Employee {

    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                                      double grossSales, double commissionRate) {
        super(firstName,  lastName,  socialSecurityNumber);
        if(grossSales<0.0){
            throw new IllegalArgumentException("Łaczna sprzedaż musi być >=0");
        }

        if(commissionRate<=0.0 || commissionRate >=1.0){
            throw new IllegalArgumentException("Procent prowizji musi być > 0.0 i < 1.0");
        }


        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if(grossSales<0.0){
            throw new IllegalArgumentException("Łaczna sprzedaż musi być >=0");
        }
        this.grossSales = grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        if(commissionRate<=0.0 || commissionRate >=1.0){
            throw new IllegalArgumentException("Procent prowizji musi być > 0.0 i < 1.0");
        }
        this.commissionRate = commissionRate;
    }

    public double earnings(){
        return commissionRate*grossSales;
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
                "pracownik prowizyjny",
                getFirstName(), getLastName(),
                "numer ubezpieczenia", getSocialSecurityNumber(),
                "łączna sprzedaż", grossSales, "procent prowizji", commissionRate);
    }
}
