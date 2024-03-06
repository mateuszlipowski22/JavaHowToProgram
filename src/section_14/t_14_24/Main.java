package section_14.t_14_24;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            WordsBase wordsBase = new WordsBase();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Wpisz słowo : ");
            String text = scanner.nextLine();
            List<String> wordResult = wordsBase.wordCorrection(text);
            if(wordResult.contains(text)){
                System.out.println("Słowo wpisane poprawnie");
            }else {
                System.out.printf("Czy miałeś na myśli słowa \"%s\"", wordResult);
            }


        }catch (Exception e){
            System.out.println("Bład podczas przetwarzania tekstu "+e.getMessage());
        }
    }
}
