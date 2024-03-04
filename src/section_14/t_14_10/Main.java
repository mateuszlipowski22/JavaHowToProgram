package section_14.t_14_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);

            System.out.println("Wpisz tekst ");
            String textToModify = scanner.nextLine();

            System.out.printf("%s%n",textToModify.toLowerCase());
            System.out.printf("%s%n",textToModify.toUpperCase());

        }catch (Exception e){
            System.out.println("Bład podczas przetwarzania tekstu "+e.getMessage());
        }
    }
}