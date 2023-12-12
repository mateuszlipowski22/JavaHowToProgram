package section_8.t8_6;

public class Main {
    public static void main(String[] args) {

        SavingAccount saver1 = new SavingAccount(2000);
        SavingAccount saver2 = new SavingAccount(5000);

        SavingAccount.modifyInterestRate(0.04);

        System.out.printf("Miesiac : Konto 1 : Konto 1 %n");
        for (int i = 1; i <= 12; i++) {
            System.out.printf("%7d : %5.2f : %5.2f %n", i,saver1.calculateMonthlyInterest(),saver2.calculateMonthlyInterest());
        }

        SavingAccount.modifyInterestRate(0.06);

        System.out.printf("Miesiac : Konto 1 : Konto 1 %n");
        for (int i = 1; i <= 12; i++) {
            System.out.printf("%7d : %5.2f : %5.2f %n", i,saver1.calculateMonthlyInterest(),saver2.calculateMonthlyInterest());
        }
    }
}
