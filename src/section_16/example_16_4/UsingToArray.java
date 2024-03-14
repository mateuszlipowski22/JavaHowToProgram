package section_16.example_16_4;

import java.util.Arrays;
import java.util.LinkedList;

public class UsingToArray {
    public static void main(String[] args) {
        String[] colors = {"czarny", "niebieski", "zółty"};
        LinkedList<String> links = new LinkedList<>(Arrays.asList(colors));

        links.addLast("czerwony");
        links.add("różowy");
        links.add(3, "zielony");
        links.addFirst("pomarańczowy");

        colors = links.toArray(new String[links.size()]);

        System.out.println("kolory: ");

        for (String color : colors){
            System.out.println(color);
        }
    }
}
