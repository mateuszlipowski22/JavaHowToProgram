package section_14.t_14_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            PigLatin pigLatin = new PigLatin();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Wprowadz tekst do zaszyfrowania:");
            String textToCode = scanner.nextLine();

            System.out.printf("Zaszyfrowana wiadomość to:%n%s", pigLatin.getPigLatinSentence(textToCode));
        }catch (Exception e){
            System.out.println("Bład podczas szyfrowania wiadomosci");
        }
    }
}
