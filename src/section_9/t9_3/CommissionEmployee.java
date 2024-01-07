package section_9.t9_3;

public class CommissionEmployee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                                      double grossSales, double commissionRate) {
        if(grossSales<0.0){
            throw new IllegalArgumentException("Łaczna sprzedaż musi być >=0");
        }

        if(commissionRate<=0.0 || commissionRate >=1.0){
            throw new IllegalArgumentException("Procent prowizji musi być > 0.0 i < 1.0");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
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

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
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
                firstName, lastName,
                "numer ubezpieczenia", socialSecurityNumber,
                "łączna sprzedaż", grossSales, "procent prowizji", commissionRate);
    }
}
