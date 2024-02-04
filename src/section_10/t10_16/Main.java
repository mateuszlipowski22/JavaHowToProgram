package section_10.t10_16;

public class Main {
    public static void main(String[] args) {
        Payable[] payableObjects = new Payable[]{
                new Invoice("01234", "siedzenie", 2, 375.000),
                new Invoice("56789", "opona", 4, 79.00),
                new SalariedEmployee("Anna", "Nowak", "332-11-123", 800),
                new CommissionEmployee("Anna", "Kowal", "332-11-123", 8000, .05),
                new BasePlusCommissionEmployee("Anna", "Mucha", "332-11-123", 8000, .05, 1000),
                new SalariedEmployee("Jan", "Kowalski", "111-22-333", 1200),
                new PieceEmployee("Michał", "Kowalski", "111-22-333", 1200, 10)
        };

        System.out.println("Obiekty Invoice i Employee przetwarzane polimorficznie:");

        for(Payable payable : payableObjects){
            if(payable instanceof BasePlusCommissionEmployee basePlusCommissionEmployee){
                basePlusCommissionEmployee.setBaseSalary(basePlusCommissionEmployee.getBaseSalary()*1.1);
            }
            System.out.printf("%n%s %nkwota płatności: %,.2f zł%n",
                    payable.toString(),
                    payable.getPaymentAmount());
        }
    }
}
