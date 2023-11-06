package section_3.t3_12;

public class Invoice {
    private String productNumber;
    private String description;
    private int quantity;
    private double price;

    public Invoice(String productNumber, String description, int quantity, double price) {
        this.productNumber = productNumber;
        this.description = description;
        if(quantity>0){
            this.quantity = quantity;
        }
        if(price>0){
            this.price = price;
        }
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity>0){
            this.quantity = quantity;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price>0){
            this.price = price;
        }
    }

    public double getInvoiceAmount(){
        return price*quantity;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "productNumber='" + productNumber + '\'' +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
