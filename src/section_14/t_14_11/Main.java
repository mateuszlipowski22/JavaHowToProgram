package section_14.t_14_11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);

            System.out.println("Wpisz tekst ");
            String text = scanner.nextLine();
            System.out.println("Wpisz znak ");
            Character charToFind = scanner.next().charAt(0);

            int count = 0;
            int tempindex=text.indexOf(charToFind);
            while(tempindex>=0){
                count++;
                text=text.substring(tempindex+1);
                tempindex=text.indexOf(charToFind);
            }

            System.out.println("count = " + count);

        }catch (Exception e){
            System.out.println("Bład podczas przetwarzania tekstu "+e.getMessage());
        }
    }
}