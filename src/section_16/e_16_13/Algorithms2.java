package org.programowanie_w_java.section_16.e_16_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algorithms2 {
    public static void main(String[] args) {
        String[] colors = {"czerwony", "biały", "niebieski", "żółty"};

        List<String> list1 = new ArrayList<>(Arrays.asList(colors));

        List<String> list2 = new ArrayList<>();
        list2.add("czarny");
        list2.add("czerwony");
        list2.add("zielony");

        System.out.print("Przed addAll list2 zawiera: ");
        list2.forEach(color-> System.out.printf("%s ",color));

        Collections.addAll(list2, colors);
        System.out.print("Po addAll list2 zawiera: ");
        list2.forEach(color-> System.out.printf("%s ",color));

        int frequency = Collections.frequency(list2,"czerwony");
        System.out.printf("%nCzęstość występowania czerwony w list2: %d%n",frequency);

        boolean disjoint = Collections.disjoint(list2,list1);
        System.out.printf("list1 i list2 %s czesci wspolne", (disjoint ? "nie mają" : "mają"));
    }
}
