package section_14.t_14_17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);

            System.out.println("Wpisz 5 literowe słowo : ");
            String text = scanner.nextLine();
            System.out.println("Trzy literowe słowa to:");

            List<String> words = getThreeLetterWords(text);
            words.forEach(word-> System.out.printf("%s%n",word));

        }catch (Exception e){
            System.out.println("Bład podczas przetwarzania tekstu "+e.getMessage());
        }
    }

    public static List<String> getThreeLetterWords(String text){
       List<String> words = new ArrayList<>();
       char[] characters = text.toCharArray();
       for(int i=0;i<text.length();i++){
           for(int j=0;j<text.length();j++){
               for(int k=0;k<text.length();k++){
                    String newWord = String.format("%c%c%c",characters[i],characters[j],characters[k]);
                    if(!words.contains(newWord)){
                        words.add(newWord);
                    }
               }
           }
       }

       return words;
    }
}
