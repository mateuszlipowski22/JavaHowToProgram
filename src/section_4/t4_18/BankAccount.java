package section_4.t4_18;

public class BankAccount {

    private int accountNumber;
    private int balance;
    private int income;
    private int outcome;
    private int limit;

    public BankAccount(int accountNumber, int balance, int income, int outcome, int limit) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.income = income;
        this.outcome = outcome;
        this.limit = limit;
    }

    public int getBalance() {
        return balance;
    }

    public int getIncome() {
        return income;
    }

    public int getOutcome() {
        return outcome;
    }

    public int getLimit() {
        return limit;
    }
}
