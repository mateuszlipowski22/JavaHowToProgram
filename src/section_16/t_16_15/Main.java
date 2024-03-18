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

        System.out.println("Posortowana lista: ");
        System.out.printf("%s %n",linkedList);


        LinkedList<Character> reverseOrder = createReversedList(linkedList);
        System.out.println("Posortowana odwrotna lista: ");
        System.out.printf("%s %n",reverseOrder);
    }

    private static LinkedList<Character> createReversedList(LinkedList<Character> linkedList) {
        ListIterator<Character> iterator = linkedList.listIterator(linkedList.size());
        LinkedList<Character> result = new LinkedList<>();
        while(iterator.hasPrevious()){
            result.add(iterator.previous());
        }
        return result;
    }
}
