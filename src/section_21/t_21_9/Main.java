package section_21.t_21_9;

import java.security.SecureRandom;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new List<>();
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.ints(0,100)
                .limit(25)
                .forEach(list::add);

        list.print();

        List<Integer> reversedList = list.reverseCopy();
        reversedList.print();
    }
}
