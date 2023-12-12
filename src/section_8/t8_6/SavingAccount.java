package section_8.t8_6;

public class SavingAccount {

    public static double annualInterestRate;

    private double savingBalance;

    public double calculateMonthlyInterest(){
        this.savingBalance=this.savingBalance*(1 + annualInterestRate/12);
        return this.savingBalance;
    }

    public static void modifyInterestRate(double annualInterestRate){
        SavingAccount.annualInterestRate = annualInterestRate;
    }

    public SavingAccount(double savingBalance) {
        this.savingBalance = savingBalance;
    }
}
