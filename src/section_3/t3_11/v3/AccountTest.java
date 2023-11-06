package section_3.t3_11.v3;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {

        Account account1 = new Account("Jan Nowak", 50.00);
        Account account2 = new Account("Marej Kowlaski", -7.67);

        System.out.printf("%s - stan konta %.2f pln %n", account1.getName(), account1.getBalance());
        System.out.printf("%s - stan konta %.2f pln %n", account2.getName(), account2.getBalance());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz kwote do wpłscenia na konto account1 : ");
        double depositeAmmount = scanner.nextDouble();

        System.out.printf("%n Dodanie %.2f do stanu konta account 1 %n", depositeAmmount);
        account1.deposite(depositeAmmount);

        System.out.printf("%s - stan konta %.2f pln %n", account1.getName(), account1.getBalance());
        System.out.printf("%s - stan konta %.2f pln %n", account2.getName(), account2.getBalance());

        System.out.println("Wpisz kwote do wpłscenia na konto account1 : ");
        depositeAmmount = scanner.nextDouble();

        System.out.printf("%n Dodanie %.2f do stanu konta account 2 %n", depositeAmmount);
        account2.deposite(depositeAmmount);

        System.out.printf("%s - stan konta %.2f pln %n", account1.getName(), account1.getBalance());
        System.out.printf("%s - stan konta %.2f pln %n", account2.getName(), account2.getBalance());
    }
}
