package section_14.t_14_13;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);

            System.out.println("Wpisz tekst : ");
            String text = scanner.nextLine();
            System.out.println("Slowa na litere b : ");
            Arrays.stream(text.split(" "))
                    .filter(word -> word.charAt(0)=='b')
                    .forEach(System.out::println);

        }catch (Exception e){
            System.out.println("Bład podczas przetwarzania tekstu "+e.getMessage());
        }
    }

}
