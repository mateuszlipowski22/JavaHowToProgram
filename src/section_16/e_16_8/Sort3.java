package org.programowanie_w_java.section_16.e_16_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort3 {
    public static void main(String[] args) {
        List<Time2> list = new ArrayList<>();

        list.add(new Time2(34, 24, 6));
        list.add(new Time2(58, 14, 18));
        list.add(new Time2(34, 5, 6));
        list.add(new Time2(58, 14, 12));
        list.add(new Time2(22, 24, 6));

        System.out.printf("Nieposortowane elementy tablicy: %s%n", list);
        Collections.sort(list, new TimeComparator());
        System.out.printf("Posortowane elementy tablicy: %s%n", list);
    }
}
