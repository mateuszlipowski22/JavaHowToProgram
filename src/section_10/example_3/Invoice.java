package section_10.example_3;

public class Invoice implements Payable {
    private final String partNumber;
    private final String partDescription;
    private final int quantity;
    private final double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Sztuki muszą być >=0");
        }

        if (pricePerItem < 0.0) {
            throw new IllegalArgumentException("Cena za sztuke musi być >=0");
        }

        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    @Override
    public String toString() {
        return String.format("%s: %n%s: %s (%s) %n%s %d %n%s: %,.2f zł",
                "faktura", "numer części", getPartNumber(), getPartDescription()
                ,"liczba sztuk", getQuantity(), "cena za sztuke", getPricePerItem());
    }

    @Override
    public double getPaymentAmount() {
        return getQuantity() * getPricePerItem();
    }
}
