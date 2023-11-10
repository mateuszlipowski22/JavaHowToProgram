package section_4.t4_18;

import java.util.Objects;

public class CreditLimit {
    public void isBelowLimit(BankAccount bankAccount){
        if (Objects.isNull(bankAccount)){
            return;
        }

        if(bankAccount.getLimit()+bankAccount.getBalance()+bankAccount.getIncome()-bankAccount.getOutcome()>=0){
            System.out.println("Limit nie został przekroczony");
        }else {
            System.out.println("Przekroczono limit kredytowy");
        }
    }
}
