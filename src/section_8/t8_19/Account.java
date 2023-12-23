package section_8.t8_19;

import java.math.BigDecimal;

public class Account {
    private String name;
    private BigDecimal balance;

    public Account(String name, double balance) {
        this.name = name;
        if(balance > 0){
            this.balance = BigDecimal.valueOf(balance);
        }else {
            this.balance = BigDecimal.ZERO;
        }
    }

    public void deposite(double depositeAmount){
        if (depositeAmount > 0){
            this.balance=this.balance.add(BigDecimal.valueOf(depositeAmount));
        }
    }

    public void withdraw(double withdrawAmount){
        if (this.balance.compareTo(BigDecimal.valueOf(withdrawAmount))>0){
            this.balance=this.balance.subtract(BigDecimal.valueOf(withdrawAmount));
        }else {
            System.out.println("Wypłata przekroczyła dostępny stan środków");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance.doubleValue();
    }
}
