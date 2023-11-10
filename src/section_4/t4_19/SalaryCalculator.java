package section_4.t4_19;

import java.util.List;

public class SalaryCalculator {

    public double calculateSalary(List<SoldProduct> soldProducts){
        double base = soldProducts.stream()
                .map(soldProduct -> soldProduct.getQuantity()*soldProduct.getPrice())
                .mapToDouble(a->a)
                .sum();
        return 2000 + base*0.09d;
    }

}
