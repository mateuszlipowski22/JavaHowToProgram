package org.programowanie_w_java.section_16.e_16_7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort2 {
    public static void main(String[] args) {
        String[] suits = {"Trefl","Karo","Kier","Pik"};
        List<String> list = Arrays.asList(suits);
        System.out.printf("Nieposortowane elementy tablicy: %s%n",list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.printf("Posortowane elementy tablicy: %s%n",list);
    }
}
