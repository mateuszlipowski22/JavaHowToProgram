package section_14.t_14_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PigLatin {
    List<Character> vowels = new ArrayList<>(
            List.of('Q', 'W', 'R','T','O','P','S','D','F','G','H','J','K','L','Z','X','C','V','B','N','M'));

    private String getPigLatinWord(String word){
        if(vowels.contains(word.charAt(0))){
            return word.substring(1)+word.charAt(0)+"AY";
        }
        return word;
    }

    public String getPigLatinSentence(String sentence){
        StringBuilder buffer = new StringBuilder();
        Arrays.stream(sentence.toUpperCase().split(" "))
                .map(this::getPigLatinWord)
                .forEach(word -> buffer.append(word).append(" "));
        return buffer.toString();
    }
}
