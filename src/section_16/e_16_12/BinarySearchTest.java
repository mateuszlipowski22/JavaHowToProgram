package org.programowanie_w_java.section_16.e_16_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest {
    public static void main(String[] args) {
        String[] colors = {"czerwony", "biały", "niebieski","czarny","żółty","purpurowy","brązowy","różowy"};

        List<String> list = new ArrayList<>(Arrays.asList(colors));

        list.add("szary");

        Collections.sort(list);
        System.out.printf("Posortiwana ArrayList: %s%n",list);

        printSearchResult(list, "czarny");
        printSearchResult(list, "czerwony");
        printSearchResult(list, "różowy");
        printSearchResult(list, "amaratowy");
        printSearchResult(list, "szary");
        printSearchResult(list, "kawowy");

    }

    private static void printSearchResult(List<String> list, String key) {
        System.out.printf("%nSzukam: %s%n", key);
        int result = Collections.binarySearch(list,key);

        if(result>=0){
            System.out.printf("Znaleziono pod indeksem %d%n",result);
        }else {
            System.out.printf("Nie znaleziono (%d)%n",result);
        }
    }

}
