package section_9.t9_14;

public class BasePlusCommissionEmployeeTest {
    public static void main(String[] args) {
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Anna", "Nowak",
                "333-33-3333", 5000, .04, 300);

        System.out.print("Informacje o pracowniku pobrane z metod dostępowych%n:");
        System.out.printf("%s %s%n","Imie to",employee.getFirstName());
        System.out.printf("%s %s%n","Nazwisko to",employee.getLastName());
        System.out.printf("%s %s%n","Numer ubezpieczenia to",employee.getSocialSecurityNumber());
        System.out.printf("%s %s%n","Łaczna sprzedaż to",employee.getGrossSales());
        System.out.printf("%s %s%n","Procent prowizji wynosi",employee.getCommissionRate());
        System.out.printf("%s %s%n","Wynagrodzenie zasadnicze to",employee.getBaseSalary());

        employee.setBaseSalary(1000);

        System.out.println(employee.toString());
    }
}
