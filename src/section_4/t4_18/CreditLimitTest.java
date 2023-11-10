package section_4.t4_18;

public class CreditLimitTest {
    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount(123456, 100, 40, 200, 100);
        BankAccount bankAccount2 = new BankAccount(123456, 100, 40, 250, 50);

        CreditLimit creditLimit = new CreditLimit();

        creditLimit.isBelowLimit(bankAccount1);
        creditLimit.isBelowLimit(bankAccount2);

    }
}
