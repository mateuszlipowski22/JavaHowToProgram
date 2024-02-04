package section_10.t10_17;

public class CommissionCompensationModel implements CompensationModel {
    private double grossSales;
    private double commissionRate;

    public CommissionCompensationModel(double grossSales, double commissionRate) {
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    @Override
    public double earnings(){
        return this.commissionRate*this.grossSales;
    }
}
