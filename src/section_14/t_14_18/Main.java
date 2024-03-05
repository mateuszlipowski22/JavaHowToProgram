package section_14.t_14_18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            WordAnalyzer wordAnalyzer = new WordAnalyzer();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Wpisz tekst ");
            String text = scanner.nextLine();

            System.out.printf("Analiza liter : %n");
            wordAnalyzer.getLetterAnalysis(text);

            System.out.printf("Analiza dlugosci słów : %n");
            wordAnalyzer.getWordLengthAnalysis(text);

            System.out.printf("Analiza wystąpien słów : %n");
            wordAnalyzer.getWordCountAnalysis(text);

        }catch (Exception e){
            System.out.println("Bład podczas przetwarzania tekstu "+e.getMessage());
        }
    }
}
