package section_16.example_16_3;

import java.util.*;

public class ListTest {
    public static void main(String[] args) {

        String[] colors = {"czarny", "żółty", "zielony", "niebieski", "srebrny"};

        List<String> list1 = new LinkedList<>();

        for (String color : colors) {
            list1.add(color);
        }

        String[] colors2 = {"zółty", "biały", "brazowy", "niebieski", "szary", "srebrny"};

        List<String> list2 = new LinkedList<>();

        for (String color : colors2) {
            list2.add(color);
        }

        list1.addAll(list2);
        list2 = null;
        printList(list1);

        convertToUppercaseStrings(list1);
        printList(list1);

        System.out.printf("%nUsuwanie elementów od 4 do 6...%n");
        removeItems(list1, 4, 7);
        printList(list1);
        printReversedList(list1);
    }

    private static void printReversedList(List<String> list) {
        ListIterator<String> iterator = list.listIterator(list.size());

        System.out.printf("%nOdwrócona lista%n");
        while (iterator.hasPrevious()){
            System.out.printf("%s ", iterator.previous());
        }
    }

    private static void removeItems(List<String> list, int start, int end) {
        list.subList(start,end).clear();
    }

    private static void convertToUppercaseStrings(List<String> list) {
        ListIterator<String> iterator = list.listIterator();

        while (iterator.hasNext()){
            String color = iterator.next();
            iterator.set(color.toUpperCase());
        }
    }

    private static void printList(List<String> list) {
        System.out.printf("%nlista:%n");
        for (String color : list) {
            System.out.printf("%s ", color);
        }
        System.out.println();
    }
}
