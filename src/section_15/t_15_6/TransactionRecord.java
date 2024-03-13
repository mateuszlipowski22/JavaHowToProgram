package section_15.t_15_6;

public class TransactionRecord {
    private int account;
    private double amount;

    public TransactionRecord(int account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    public TransactionRecord() {
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
