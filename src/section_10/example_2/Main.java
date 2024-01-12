package section_10.example_2;


public class Main {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee(
                "Jan", "Kowalski","111-11-1111", 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee(
                "Anna", "Nowak", "222-22-2222", 16.75,40);
        CommissionEmployee commissionEmployee = new CommissionEmployee(
                "Zofia", "Lewandowska","333-33-33333",10000,.06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee(
                "Robert", "Czekaj", "444-44-4444",5000, .04, 300);

        System.out.println("Pracownicy przetwarzani pojedyńczo:");

        System.out.printf("%n%s%n%s: %,.2f pln%n%n",
                salariedEmployee,"zarobił",salariedEmployee.earnings());
        System.out.printf("%n%s%n%s: %,.2f pln%n%n",
                hourlyEmployee,"zarobił",hourlyEmployee.earnings());
        System.out.printf("%n%s%n%s: %,.2f pln%n%n",
                commissionEmployee,"zarobił",commissionEmployee.earnings());
        System.out.printf("%n%s%n%s: %,.2f pln%n%n",
                basePlusCommissionEmployee,"zarobił",basePlusCommissionEmployee.earnings());

        Employee[] employees = new Employee[4];
        employees[0]=salariedEmployee;
        employees[1]=hourlyEmployee;
        employees[2]=commissionEmployee;
        employees[3]=basePlusCommissionEmployee;

        System.out.printf("Pracownicy przetwarzani polimorficznie: %n%n");

        for (Employee currentEmployee: employees) {
            System.out.println(currentEmployee);

            if(currentEmployee instanceof BasePlusCommissionEmployee){
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;

                employee.setBaseSalary(1.1* employee.getBaseSalary());

                System.out.printf("nowe wynagrodzenie zasadnicze po podwyżce 10%% wynosi: %,.2f pln %n",
                        employee.getBaseSalary());
            }
            System.out.printf("zarobił %,.2f pln %n%n",currentEmployee.earnings());
        }

        for(int j=0 ; j<employees.length ; j++){
            System.out.printf("Pracownik %d to klasa %s%n",j,employees[j].getClass().getSimpleName());
        }
    }
}
