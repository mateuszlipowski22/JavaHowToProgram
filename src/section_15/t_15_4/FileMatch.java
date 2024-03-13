package section_15.t_15_4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

public class FileMatch {
    public void processFiles(String oldMast, String transactions, String newMast, String error) {
        StringBuilder result = new StringBuilder();
        StringBuilder errorLog = new StringBuilder();
        Map<Integer,Account> accountList;
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

        Map<Integer,TransactionRecord> transactionRecords;
        try (Scanner inTransaction = new Scanner(Paths.get(transactions))) {
            transactionRecords = new HashMap<>();
            while (inTransaction.hasNextLine()) {
                TransactionRecord transactionRecord = new TransactionRecord();
                transactionRecord.setAccount(inTransaction.nextInt());
                transactionRecord.setAmount(inTransaction.nextDouble());
                transactionRecords.put(transactionRecord.getAccount(),transactionRecord);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        transactionRecords.forEach((key,value) ->{
            if(accountList.containsKey(key)){
                accountList.get(key).combine(value);
            }else {
                errorLog.append(String.format("Niedopasowana transakcja dotycząca konta o numerze %d%n",key));
            }
        });


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
