package section_3.t3_11.v4;

public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        if(balance>0){
            this.balance = balance;
        }
    }

    public void deposite(double depositeAmount){
        if (depositeAmount>0){
            this.balance=this.balance+depositeAmount;
        }
    }

    public void withdraw(double withdrawAmount){
        if (this.balance>=withdrawAmount){
            this.balance=this.balance-withdrawAmount;
        }else {
            System.out.println("Wypłata przekroczyła mdostępny stan środków");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }
}
