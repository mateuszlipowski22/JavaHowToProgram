package section_14.t_14_18;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordAnalyzer {
    private List<Character> alphabet = Arrays.asList('a','b','c','d','e','f','g','h','i',
            'j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');


    private int getLetterCount(Character c, String text){
        int count = 0;
        int tempindex=text.indexOf(c);
        while(tempindex>=0){
            count++;
            text=text.substring(tempindex+1);
            tempindex=text.indexOf(c);
        }
        return count;
    }

    public void getLetterAnalysis(String text){
        alphabet.forEach(character -> System.out.printf("%c : %d%n",character,getLetterCount(character,text)));
    }

    public void getWordLengthAnalysis(String text) {
        Map<Integer,Integer> result = new HashMap<>();
        Arrays.asList(text.split(" "))
                .forEach(word ->{
            int numberOfLetters = word.length();
            if(result.containsKey(numberOfLetters)){
                result.put(numberOfLetters,result.get(numberOfLetters)+1);
            }else {
                result.put(numberOfLetters,1);
            }
        });
        System.out.printf("%20s : %20s%n","Długosc słowa","Wystąpienia");
        result.forEach((key,value) -> System.out.printf("%20s : %20s%n",key,value));
    }

    public void getWordCountAnalysis(String text) {
        Map<String,Integer> result = new HashMap<>();
        Arrays.asList(text.split(" "))
                .forEach(word ->{
                    if(result.containsKey(word)){
                        result.put(word,result.get(word)+1);
                    }else {
                        result.put(word,1);
                    }
                });
        System.out.printf("%20s : %20s%n","Słowo","Liczba wystąpień");
        result.forEach((key,value) -> System.out.printf("%20s : %20s%n",key,value));
    }
}
