package section_14.example_14_4;

import java.util.Arrays;

public class StringStartEnd {
    public static void main(String[] args) {
        String[] strings = {"zajęte","zajęta","wolne","aktywne"};

        for(String string : strings){
            if(string.startsWith("za")){
                System.out.printf("\"%s\" zaczyna się od \"za\"\n",string);
            }
        }

        System.out.println();

        Arrays.stream(strings).toList().forEach(string ->{
            if(string.startsWith("jęt",2)){
                System.out.printf("\"%s\" zaczyna się od \"jęt\" na pozycji 2.\n",string);
            }
        });

        System.out.println();

        Arrays.stream(strings).toList().forEach(string ->{
            if(string.endsWith("ne")){
                System.out.printf("\"%s\" kończy się od \"ne\"\n",string);
            }
        });
    }
}
