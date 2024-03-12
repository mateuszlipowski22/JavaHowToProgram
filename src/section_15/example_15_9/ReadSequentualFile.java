package section_15.example_15_9;

import javax.xml.bind.JAXB;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadSequentualFile {
    public static void main(String[] args) {
        try(BufferedReader input = Files.newBufferedReader(Paths.get(FileUtil.FILE_PATH))){
            Accounts accounts = JAXB.unmarshal(input, Accounts.class);

            System.out.printf("%-10s%-12s%-12s%10s%n",
                    "Konto", "Imię","Nazwisko","Saldo");

            accounts.getAccounts().forEach(account -> {
                System.out.printf("%-10s%-12s%-12s%10s%n",
                        account.getAccountNumber(), account.getFirstName(),
                        account.getLastName(),account.getBalance());
            });

        } catch (IOException e) {
            System.err.println("Błąd otwarcia pliku");
        }
    }
}
