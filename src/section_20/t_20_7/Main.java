package section_20.t_20_7;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Object first = new Object();
        Integer second = 2;
        Integer third = 2;
        Object four = first;
        Integer fifth = second;

        System.out.printf("First isEqualtTo second : %s%n", isEqualTo(first,second));
        System.out.printf("Second isEqualtTo third : %s%n", isEqualTo(second,third));
        System.out.printf("First isEqualtTo four : %s%n", isEqualTo(first,four));
        System.out.printf("Second isEqualtTo Fifth : %s%n", isEqualTo(second,fifth));

    }

    public static <T> boolean isEqualTo(T first, T second){
        return first.equals(second);
    }
}
