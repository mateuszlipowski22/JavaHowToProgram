package section_14.t_14_12;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Character> alphabet = Arrays.asList('a','b','c','d','e','f','g','h','i',
            'j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);

            System.out.println("Wpisz tekst ");
            String text = scanner.nextLine();
            getLetterAnalysis(text);

        }catch (Exception e){
            System.out.println("Bład podczas przetwarzania tekstu "+e.getMessage());
        }
    }

    public static int getLetterCount(Character c, String text){
        int count = 0;
        int tempindex=text.indexOf(c);
        while(tempindex>=0){
            count++;
            text=text.substring(tempindex+1);
            tempindex=text.indexOf(c);
        }
       return count;
    }

    public static void getLetterAnalysis(String text){
        alphabet.forEach(character -> System.out.printf("%c : %d%n",character,getLetterCount(character,text)));
    }
}
