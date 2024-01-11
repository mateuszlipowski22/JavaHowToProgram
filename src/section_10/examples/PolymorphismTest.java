package section_10.examples;

public class PolymorphismTest {
    public static void main(String[] args) {
        CommissionEmployee commissionEmployee = new CommissionEmployee("Jan", "Nowak",
                "222-22-2222",1000,.06);

        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Anna",
                "Nowak", "333-33-333",5000, .04, 300);

        System.out.printf("%s %s:%n%n%s%n%n",
                "Wywołanie metody toString z CommisionEmployee za pomocą zmiennej"
                ,"do obiektu klasy nadrzędnej"
                , commissionEmployee.toString());

        System.out.printf("%s %s:%n%n%s%n%n",
                "Wywołanie metody toString z BasePlusCommisionEmployee za pomocą zmiennej"
                ,"do obiektu podklasy"
                , basePlusCommissionEmployee.toString());

        CommissionEmployee commissionEmployee2 = basePlusCommissionEmployee;

        System.out.printf("%s %s:%n%n%s%n%n",
                "Wywołanie metody toString z BasePlusCommisionEmployee za pomocą zmiennej"
                ,"do obiektu nadrzednego"
                , basePlusCommissionEmployee.toString());
    }
}
