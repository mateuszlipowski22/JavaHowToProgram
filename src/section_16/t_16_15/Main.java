package section_16.t_16_15;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        LinkedList<Character> linkedList = new LinkedList<>();

        for(int i =0 ; i<25; i++){
            linkedList.add((char) random.nextInt(100));
        }

        Collections.sort(linkedList);

        System.out.println("Orginalna lista: ");
        System.out.printf("%s %n",linkedList);


        LinkedList<Character> reverseOrder = createReversedList(linkedList);
        System.out.println("Posortowana odwrotna lista: ");
        System.out.printf("%s %n",reverseOrder);

        System.out.println("Orginalna lista: ");
        System.out.printf("%s %n",linkedList);

        LinkedList<Character> reverseOrder2 = createReversedList2(linkedList);
        System.out.println("Posortowana odwrotna lista: ");
        System.out.printf("%s %n",reverseOrder2);
    }

    private static LinkedList<Character> createReversedList(LinkedList<Character> linkedList) {
        ListIterator<Character> iterator = linkedList.listIterator(linkedList.size());
        LinkedList<Character> result = new LinkedList<>();
        while(iterator.hasPrevious()){
            result.add(iterator.previous());
        }
        return result;
    }

    private static LinkedList<Character> createReversedList2(LinkedList<Character> linkedList) {
        LinkedList<Character> copy = new LinkedList<>(linkedList);
        Collections.reverse(copy);
        return copy;
    }
}
