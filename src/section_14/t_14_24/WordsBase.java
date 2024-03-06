package section_14.t_14_24;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class WordsBase {
    List<String> wordList = new ArrayList<>();
    public WordsBase() {
        try{
            Path path = Paths.get("src/section_14/t_14_24/slowa.txt");

            BufferedReader reader = Files.newBufferedReader(path);
            String line;
            while ((line = reader.readLine()) != null) {
                wordList.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void printDictionary(){
        wordList.forEach(word -> System.out.printf("%s%n",word));
    }

    public List<String> wordCorrection(String word){
        int length = word.length();
        SortedMap<String, Integer> result = new TreeMap<>();
        List<String> tempList = wordList.stream()
                .filter(text->(text.length()==length))
                .toList();
        int correctLetter;

        for(String currentWord : tempList){
            correctLetter=0;

            for(int i=0;i<length;i++){
                if(word.charAt(i)==currentWord.charAt(i)){
                    correctLetter++;
                }
            }

            if(result.isEmpty()) {
                result.put(currentWord,correctLetter);
            }

            if(result.sequencedValues().getFirst()<=correctLetter){
                result.put(currentWord,correctLetter);
            }

        }

        return result.entrySet().stream()
                .filter(entry->(entry.getValue()==length || entry.getValue()+1==length))
                .map(Map.Entry::getKey).toList();
    }
}
