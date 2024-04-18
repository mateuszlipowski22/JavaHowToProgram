package section_21.t_21_8;

import java.security.SecureRandom;

public class Main {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();

        SortedList<Integer> firstList = new SortedList<>();
        secureRandom.ints(0,100)
                .limit(25)
                .forEach(firstList::add);
        firstList.print();

        SortedList<Integer> secondList = new SortedList<>();
        secureRandom.ints(0,100)
                .limit(25)
                .forEach(secondList::add);
        secondList.print();

        firstList.merge(secondList);
        firstList.print();
    }
}
