package org.programowanie_w_java.section_16.e_16_6;

import org.aspectj.apache.bcel.classfile.SourceFile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort1 {
    public static void main(String[] args) {
        String[] suits = {"Trefl","Karo","Kier","Pik"};
        List<String> list = Arrays.asList(suits);
        System.out.printf("Nieposortowane elementy tablicy: %s%n",list);
        Collections.sort(list);
        System.out.printf("Posortowane elementy tablicy: %s%n",list);
    }
}
