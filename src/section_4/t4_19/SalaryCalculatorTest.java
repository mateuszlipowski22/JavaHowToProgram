package section_4.t4_19;

import java.util.Arrays;
import java.util.List;

public class SalaryCalculatorTest {

    public static void main(String[] args) {

        List<SoldProduct> soldProductList = Arrays
                .asList(
                        new SoldProduct(1, 239.99),
                        new SoldProduct(1, 1129.75),
                        new SoldProduct(1, 99.95),
                        new SoldProduct(1, 850.89)
                );

        SalaryCalculator salaryCalculator = new SalaryCalculator();

        System.out.println("Wypłata pracownika : " +salaryCalculator.calculateSalary(soldProductList));
    }

}
