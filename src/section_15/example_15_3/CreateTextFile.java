package section_15.example_15_3;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextFile {
    public static void main(String[] args) {
        try(Formatter output = new Formatter("client.txt")){
            Scanner input = new Scanner(System.in);
            System.out.printf("%s%n%s%n",
                    "Wpisz numer konta, imie, nazwisko i saldo",
                    "Wpisz wskaźnik końca danych, aby zakończyć");

            while(input.hasNext()){
                try{
                    output.format("%d %s %s %.2f%n",
                            input.nextInt(), input.next(), input.next(), input.nextDouble());
                }catch (NoSuchElementException noSuchElementException){
                    System.err.println("Niepoprawne dane. Spróbuj ponownie");
                    input.nextLine();
                }
                System.out.print("? ");
            }

        } catch (SecurityException | FileNotFoundException | FormatterClosedException e) {
            e.printStackTrace();
        }
    }
}
