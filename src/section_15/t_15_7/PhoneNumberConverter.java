package section_15.t_15_7;

import java.util.*;

public class PhoneNumberConverter {

    private final Map<Integer,List<String>> conversionTable;

    public PhoneNumberConverter() {
        this.conversionTable = new HashMap<>();
        conversionTable.put(2, Arrays.asList("A","B","C"));
        conversionTable.put(3, Arrays.asList("D","E","F"));
        conversionTable.put(4, Arrays.asList("G","H","I"));
        conversionTable.put(5, Arrays.asList("J","K","L"));
        conversionTable.put(6, Arrays.asList("M","N","O"));
        conversionTable.put(7, Arrays.asList("P","Q","R","S"));
        conversionTable.put(8, Arrays.asList("T","U","V"));
        conversionTable.put(9, Arrays.asList("W","X","Y","Z"));
    }

    public List<String> getWordList(String phoneNumber){
        if(phoneNumber.matches("(.*)1(.*)") || phoneNumber.matches("(.*)0(.*)")){
            return null;
        }

        List<Integer> digits = new ArrayList<>();
        for(char character : phoneNumber.replaceAll("-","").toCharArray()){
            digits.add(Integer.valueOf(String.valueOf(character)));
        }

        Set<String> result = new HashSet<>();
        conversionTable.get(digits.get(0)).forEach(character -> result.add(String.valueOf(character)));

        for(int index = 1 ; index<digits.size();index++){

            List<String> tempWordList = new ArrayList<>();
            for(String word : result){
                if(word.length()==index){
                    tempWordList.add(word);
                }
            }

            tempWordList.forEach(result::remove);

            for(String currentWord : tempWordList){
                String tempWord = new String(currentWord);
                for(String currentLetter : conversionTable.get(digits.get(index))){
                    result.add(tempWord+currentLetter);
                }
            }
        }

        return result.stream().toList();
    }
}
