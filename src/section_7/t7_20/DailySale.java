package section_7.t7_20;

import java.util.HashMap;
import java.util.Map;

public class DailySale {
    private SalesPerson salesPerson;
    private Map<Product, Double> soldItems;

    public DailySale(SalesPerson salesPerson) {
        this.salesPerson = salesPerson;
        this.soldItems=new HashMap<>();
    }

    public void addSoldItem(Product product, Double amnount){
        if(soldItems.containsKey(product)){
            soldItems.put(product, soldItems.get(product)+amnount);
        }else {
            soldItems.put(product,amnount);
        }
    }

    public SalesPerson getSalesPerson() {
        return salesPerson;
    }

    public Map<Product, Double> getSoldItems() {
        return soldItems;
    }
}
