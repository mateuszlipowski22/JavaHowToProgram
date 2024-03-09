package section_14.t_14_23;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public class UnitConverter {

    Map<String,String> units;
    Map<String,Map<String,Double>> conversionTable;

    public UnitConverter() {
        units=new HashMap<>();
        units.put("centymetr", "cal");
        units.put("metr", "cal");
        units.put("litr", "kwarta");
        units.put("kilogram", "funt");

        conversionTable=new HashMap<>();
        conversionTable.put("centymetr",new HashMap<String, Double>() {{
            put("cal", 0.393700787);
            put("stopa", 0.032808399);
        }});

        conversionTable.put("cal",new HashMap<String, Double>() {{
            put("centymetr", 2.54);
            put("metr", 0.0254);
        }});
    }

    private Double convertValue(String first, String second, Double value){
        return conversionTable.get(second).get(first)*value;
    }

    private boolean sentenceAnalyze(String sentence){
        AtomicBoolean result = new AtomicBoolean(false);
        units.forEach((key, value) -> {
            if (sentence.matches(String.format("(.*)%s(.*)",key))) {
                if (sentence.matches(String.format("(.*)%s(.*)",value)))  {
                    result.set(true);
                }
            }
        });
        return result.get();
    }


    public boolean isNumeric(String strNum) {
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

        if (strNum == null) {
            return false;
        }

        return pattern.matcher(strNum).matches();
    }

    public String convert(String sentence){
        if(!sentenceAnalyze(sentence)){
            return "Niepoprawne jednostki konwersji";
        }

        String first = null;
        String second = null;
        Double value=null;

        List<String> words = new java.util.ArrayList<>(Arrays.stream(sentence.split(" ")).toList());

        for (String word : words){
            if(units.containsKey(word) || units.containsValue(word)){
                first=word;
                words.remove(word);
                break;
            }
        }

        for (String word : words){
            if(units.containsKey(word) || units.containsValue(word)){
                second=word;
                words.remove(word);
                break;
            }
        }

        for (String word : words){
            if(isNumeric(word)){
                value=Double.valueOf(word);
            }
        }

        return String.format("%.2f %s to %.2f %s",value,second,convertValue(first,second,value),first);
    }
}
