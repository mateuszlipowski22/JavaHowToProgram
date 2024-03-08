package section_14.t_14_22;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MorseCode {

    private final Map<Character, String> morseCodeTable;

    public MorseCode() {
        morseCodeTable = new HashMap<>();
        morseCodeTable.put('A', ".-");
        morseCodeTable.put('B', "-...");
        morseCodeTable.put('C', "-.-.");
        morseCodeTable.put('D', "-..");
        morseCodeTable.put('E', ".");
        morseCodeTable.put('F', "..-.");
        morseCodeTable.put('G', "--.");
        morseCodeTable.put('H', "....");
        morseCodeTable.put('I', "..");
        morseCodeTable.put('J', ".---");
        morseCodeTable.put('K', "-.-");
        morseCodeTable.put('L', ".-..");
        morseCodeTable.put('M', "--");
        morseCodeTable.put('N', "-.");
        morseCodeTable.put('O', "---");
        morseCodeTable.put('P', ".--.");
        morseCodeTable.put('Q', "--.-");
        morseCodeTable.put('R', ".-.");
        morseCodeTable.put('S', "...");
        morseCodeTable.put('T', "-");
        morseCodeTable.put('U', "..-");
        morseCodeTable.put('V', "...-");
        morseCodeTable.put('W', ".--");
        morseCodeTable.put('X', "-..-");
        morseCodeTable.put('Y', "-.--");
        morseCodeTable.put('Z', "--..");
        morseCodeTable.put('1', ".----");
        morseCodeTable.put('2', "..---");
        morseCodeTable.put('3', "...--");
        morseCodeTable.put('4', "....-");
        morseCodeTable.put('5', ".....");
        morseCodeTable.put('6', "-....");
        morseCodeTable.put('7', "--...");
        morseCodeTable.put('8', "---..");
        morseCodeTable.put('9', "----.");
        morseCodeTable.put('0', "-----");
    }

    public String convertToMorseCode(String word) {
        StringBuilder builder = new StringBuilder();
        word.toUpperCase().chars().forEach(letter -> {
            if (letter == 32) {
                builder.append("   ");
            } else {
                builder.append(morseCodeTable.get((char) letter)).append(" ");
            }
        });
        return builder.toString();
    }

    private String convertWordToText(String word) {
        StringBuilder builder = new StringBuilder();
        Arrays.stream(word.split(" "))
                .toList()
                .forEach(sign -> {
                    for (Map.Entry<Character, String> entry : morseCodeTable.entrySet()) {
                        if (entry.getValue().equals(sign)) {
                            builder.append(entry.getKey());
                        }
                    }
                });
        return builder.toString();
    }

    public String convertSentenceToText(String sentence) {
        StringBuilder builder = new StringBuilder();
        Arrays.stream(sentence.split("   "))
                .toList()
                .forEach(word -> builder.append(convertWordToText(word)).append(" "));
        return builder.toString();
    }
}
