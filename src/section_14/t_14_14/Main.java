package section_14.t_14_14;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);

            System.out.println("Wpisz tekst : ");
            String text = scanner.nextLine();
            System.out.println("Slowa na konczace sie na \"NY\" : ");
            Arrays.stream(text.toUpperCase().split(" "))
                    .filter(word -> word.endsWith("NY"))
                    .forEach(System.out::println);

        }catch (Exception e){
            System.out.println("Bład podczas przetwarzania tekstu "+e.getMessage());
        }
    }

}
