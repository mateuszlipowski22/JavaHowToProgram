package section_14.t_14_22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            MorseCode morseCode = new MorseCode();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Wpisz słowo : ");
            String word = scanner.nextLine();

            System.out.println(morseCode.convertToMorseCode(word));

            System.out.println("Wpisz słowo w morse : ");
            String codedWord = scanner.nextLine();
            System.out.println(morseCode.convertSentenceToText(codedWord));

        }catch (Exception e){
            System.out.println("Bład podczas przetwarzania tekstu "+e.getMessage());
        }
    }
}
