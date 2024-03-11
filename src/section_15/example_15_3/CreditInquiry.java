package section_15.example_15_3;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreditInquiry {
    private final static MenuOption[] choices = MenuOption.values();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MenuOption accountType = getRequest(input);

        while (accountType != MenuOption.END) {
            switch (accountType) {
                case ZERO_BALANCE -> System.out.printf("%nKonra z saldem zerowym:%n");
                case CREDIT_BALANCE -> System.out.printf("%nKonra z saldem ujemny:%n");
                case DEBIT_BALANCE -> System.out.printf("%nKonra z saldem dodatnim:%n");
            }

            readRecords(accountType);
            accountType = getRequest(input);
        }
    }

    private static MenuOption getRequest(Scanner input) {
        int request = 4;
        System.out.printf("%nWpisz żądanie%n%s%n%s%n%s%n%s",
                " 1 - Lista kont o saldzie zerowyn",
                " 2 - Lista kont o saldzie ujemnym",
                " 3 - Lista kont o saldzie dodatnim",
                " 4 - Przerwij program");

        try {
            do {
                System.out.printf("%n?");
                request = input.nextInt();
            } while ((request < 1) || (request > 4));
        } catch (NoSuchElementException noSuchElementException) {
            System.err.println("Niepoprawne dane. Przerywam.");
        }
        return choices[request - 1];
    }

    private static void readRecords(MenuOption accountType) {
        try (Scanner input = new Scanner(Paths.get(FileUtil.FILE_PATH))) {
            while (input.hasNext()) {
                int accountNumber = input.nextInt();
                String firstName = input.next();
                String lastName = input.next();
                double balance = input.nextDouble();

                if (shouldDisplay(accountType, balance)) {
                    System.out.printf("%-10d%-12s%-12s%10.2f%n",
                            accountNumber, firstName, lastName, balance);
                } else {
                    input.nextLine();
                }
            }
        } catch (IOException e) {
            System.err.println("Błąd przetwarzania pliku. Przerywam.");
            System.exit(1);
        }
    }

    private static boolean shouldDisplay(MenuOption accountType, double balance) {
        if ((accountType == MenuOption.CREDIT_BALANCE) && (balance < 0)) {
            return true;
        } else if ((accountType == MenuOption.DEBIT_BALANCE) && (balance > 0)) {
            return true;
        } else if ((accountType == MenuOption.ZERO_BALANCE) && (balance == 0)) {
            return true;
        }
        return false;
    }
}
