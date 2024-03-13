package section_15.t_15_5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

public class FileMatch {
    public void processFiles(String oldMast, String transactions, String newMast, String error) {
        StringBuilder result = new StringBuilder();
        StringBuilder errorLog = new StringBuilder();
        Map<Integer, Account> accountList;
        try (Scanner inOldMaster = new Scanner(Paths.get(oldMast))) {
            accountList = new HashMap<>();
            while (inOldMaster.hasNextLine()) {
                Account account = new Account();
                account.setAccountNumber(inOldMaster.nextInt());
                account.setFirstName(inOldMaster.next());
                account.setLastName(inOldMaster.next());
                account.setBalance(inOldMaster.nextDouble());
                accountList.put(account.getAccountNumber(),account);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        List<TransactionRecord> transactionRecords;
        try (Scanner inTransaction = new Scanner(Paths.get(transactions))) {
            transactionRecords = new ArrayList<>();
            while (inTransaction.hasNextLine()) {
                TransactionRecord transactionRecord = new TransactionRecord();
                transactionRecord.setAccount(inTransaction.nextInt());
                transactionRecord.setAmount(inTransaction.nextDouble());
                transactionRecords.add(transactionRecord);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for(TransactionRecord transactionRecord : transactionRecords){
            if(accountList.containsKey(transactionRecord.getAccount())){
                accountList.get(transactionRecord.getAccount()).combine(transactionRecord);
//                tempAccount.combine(entry.getValue());
//                accountList.put(tempAccount.getAccountNumber(),tempAccount);
            }else {
                errorLog.append(String.format("Niedopasowana transakcja dotycząca konta o numerze %d%n",transactionRecord.getAccount()));
            }
        }


        accountList.forEach((key,value)->{
            result.append(String.format("%-10s%-12s%-12s%10s%n",
                    value.getAccountNumber(), value.getFirstName(),
                    value.getLastName(), value.getBalance()));
        });


        try (Formatter outNewMast = new Formatter(newMast)) {
            outNewMast.format(result.toString());
        } catch (SecurityException | FileNotFoundException | FormatterClosedException e) {
            e.printStackTrace();
        }

        try (Formatter outErrorLog = new Formatter(error)) {
            outErrorLog.format(errorLog.toString());
        } catch (SecurityException | FileNotFoundException | FormatterClosedException e) {
            e.printStackTrace();
        }
    }
}
