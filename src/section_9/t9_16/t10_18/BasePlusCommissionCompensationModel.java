package section_9.t9_16.t10_18;

public class BasePlusCommissionCompensationModel implements CompensationModel {
    private double baseSalary;
    private double grossSales;
    private double commissionRate;

    public BasePlusCommissionCompensationModel(double baseSalary, double grossSales, double commissionRate) {
        this.baseSalary = baseSalary;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    @Override
    public double earnings(){
        return this.baseSalary+this.commissionRate*this.grossSales;
    }
}
