package section_7.t7_20;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        DailyReport dailyReport = new DailyReport(Date.valueOf("2023-11-26"));

        DailySale dailySale = new DailySale(SalesPerson.SALES_PERSON_1);
        dailySale.addSoldItem(Product.ITEM_1, 20d);
        dailySale.addSoldItem(Product.ITEM_2, 30d);
        dailySale.addSoldItem(Product.ITEM_2, 30d);
        dailyReport.addReport(dailySale);

        dailySale = new DailySale(SalesPerson.SALES_PERSON_2);
        dailySale.addSoldItem(Product.ITEM_2, 20d);
        dailySale.addSoldItem(Product.ITEM_3, 30d);
        dailySale.addSoldItem(Product.ITEM_3, 30d);
        dailyReport.addReport(dailySale);


        DailyReport dailyReport2 = new DailyReport(Date.valueOf("2023-11-27"));

        DailySale dailySale2 = new DailySale(SalesPerson.SALES_PERSON_1);
        dailySale2.addSoldItem(Product.ITEM_1, 20d);
        dailySale2.addSoldItem(Product.ITEM_2, 30d);
        dailySale2.addSoldItem(Product.ITEM_2, 30d);
        dailySale2.addSoldItem(Product.ITEM_4, 30d);

        dailyReport2.addReport(dailySale2);

        dailySale2 = new DailySale(SalesPerson.SALES_PERSON_2);
        dailySale2.addSoldItem(Product.ITEM_2, 20d);
        dailySale2.addSoldItem(Product.ITEM_3, 30d);
        dailySale2.addSoldItem(Product.ITEM_3, 40d);

        dailyReport2.addReport(dailySale2);

        List<DailyReport> reports = new ArrayList<>();
        reports.add(dailyReport);
        reports.add(dailyReport2);

        for(DailyReport report : reports){
            System.out.printf("Date : %s %n",report.getDate());
            for (Map.Entry<SalesPerson, DailySale> entry : report.getReport().entrySet()) {
                System.out.printf("%20s%n", entry.getKey().toString());
                for (Map.Entry<Product, Double> sale : entry.getValue().getSoldItems().entrySet()) {
                    System.out.printf(" %20s ", sale.getKey().toString());
                }
                System.out.printf("%n");
                for (Map.Entry<Product, Double> sale : entry.getValue().getSoldItems().entrySet()) {
                    System.out.printf(" %20.2f ", sale.getValue());
                }
                System.out.printf("%n");
            }
        }

    }
}
