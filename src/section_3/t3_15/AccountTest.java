package section_3.t3_15;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {

        Account account1 = new Account("Jan Nowak", 50.00);
        Account account2 = new Account("Marej Kowlaski", -7.67);

        displayAccount(account1);
        displayAccount(account2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz kwote do wypłacenia z konto account1 : ");
        double withdrawAmount = scanner.nextDouble();

        System.out.printf("Wypłata %.2f do stanu konta account 1 %n", withdrawAmount);
        account1.withdraw(withdrawAmount);

        displayAccount(account1);
        displayAccount(account2);

        System.out.println("Wpisz kwote do wypłacenia z konto account2 : ");
        withdrawAmount = scanner.nextDouble();

        System.out.printf("Wypłata %.2f do stanu konta account 2 %n", withdrawAmount);
        account2.withdraw(withdrawAmount);

        displayAccount(account1);
        displayAccount(account2);
    }

    private static void displayAccount(Account account) {
        System.out.printf("%s - stan konta %.2f pln %n", account.getName(), account.getBalance());
    }
}
