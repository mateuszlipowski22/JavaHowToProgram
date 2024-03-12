package section_15.example_15_9;

import javax.xml.bind.JAXB;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateSequentialFile {
    public static void main(String[] args) {
        try(BufferedWriter output =
                    Files.newBufferedWriter(Paths.get(FileUtil.FILE_PATH))){
            Scanner input = new Scanner(System.in);
            Accounts accounts = new Accounts();
            System.out.printf("%s%n%s%n",
                    "Wpisz numer konta, imie, nazwisko i saldo",
                    "Wpisz wskaźnik końca danych, aby zakończyć");

            while(input.hasNext()){
                try{
                    Account account = new Account(
                            input.nextInt(), input.next(), input.next(), input.nextDouble());
                    accounts.getAccounts().add(account);
                }catch (NoSuchElementException noSuchElementException){
                    System.err.println("Niepoprawne dane. Spróbuj ponownie");
                    input.nextLine();
                }
                System.out.print("? ");
            }
            JAXB.marshal(accounts,output);
        } catch (IOException e) {
            System.err.println("Błąd otwarcia pliku. Kończę działanie.");
        }
    }
}
