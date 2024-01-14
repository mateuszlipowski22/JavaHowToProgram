package section_10.example_3;

public class Main {
    public static void main(String[] args) {
        Payable[] payableObjects = new Payable[]{
                new Invoice("01234", "siedzenie", 2, 375.000),
                new Invoice("56789", "opona", 4, 79.00),
                new SalariedEmployee("Anna", "Nowak", "332-11-123", 800),
                new SalariedEmployee("Jan", "Kowalski", "111-22-333", 1200),
        };

        System.out.println("Obiekty Invoice i Employee przetwarzane polimorficznie:");

        for(Payable payable : payableObjects){
            System.out.printf("%n%s %nkwota płatności: &,.2f zł%n",
                    payable.toString(),
                    payable.getPaymentAmount());
        }
    }
}
