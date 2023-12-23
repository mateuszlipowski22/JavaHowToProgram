package section_8.t8_19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Account account1 = new Account("Jan Nowak", 50.00);
        Account account2 = new Account("Marej Kowlaski", -7.67);

        System.out.printf("%s - stan konta %.2f pln %n", account1.getName(), account1.getBalance());
        System.out.printf("%s - stan konta %.2f pln %n", account2.getName(), account2.getBalance());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz kwote do wypłacenia z konto account1 : ");
        double withdrawAmount = scanner.nextDouble();

        System.out.printf("Wypłata %.2f do stanu konta account 1 %n", withdrawAmount);
        account1.withdraw(withdrawAmount);

        System.out.printf("%s - stan konta %.2f pln %n", account1.getName(), account1.getBalance());
        System.out.printf("%s - stan konta %.2f pln %n", account2.getName(), account2.getBalance());

        System.out.println("Wpisz kwote do wypłacenia z konto account2 : ");
        withdrawAmount = scanner.nextDouble();

        System.out.printf("Wypłata %.2f do stanu konta account 2 %n", withdrawAmount);
        account2.withdraw(withdrawAmount);

        System.out.printf("%s - stan konta %.2f pln %n", account1.getName(), account1.getBalance());
        System.out.printf("%s - stan konta %.2f pln %n", account2.getName(), account2.getBalance());
    }
}
