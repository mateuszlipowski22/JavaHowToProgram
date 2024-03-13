package section_15.t_15_2;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner inOldMaster = new Scanner(Paths.get(FileUtil.FILE_PATH_OLD_MAST));
            Scanner inTransaction = new Scanner(Paths.get(FileUtil.FILE_PATH_TRANS));
            Formatter outNewMast = new Formatter(FileUtil.FILE_PATH_NEW_MAST);

            Account account = new Account();
            account.setAccountNumber(inOldMaster.nextInt());
            account.setFirstName(inOldMaster.next());
            account.setLastName(inOldMaster.next());
            account.setBalance(inOldMaster.nextDouble());

            TransactionRecord transactionRecord = new TransactionRecord();
            transactionRecord.setAccount(inTransaction.nextInt());
            transactionRecord.setAmount(inTransaction.nextDouble());

            outNewMast.format("%-10s%-12s%-12s%10s%n",
                    account.getAccountNumber(), account.getFirstName(),
                    account.getLastName(),account.getBalance());



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
