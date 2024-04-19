package section_21.t_21_11;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Wpisz zdanie");
            System.out.printf("Zdanie %s palindromeme", isPalindrome(scanner.nextLine())? "jest": "nie jest");

        } catch (Exception e) {
            System.out.println("Błąd podczas pobierania danych");
            e.printStackTrace();
        }
    }

    public static boolean isPalindrome(String text) {
        Stack<Character> stack = new Stack<>();

        List<Character> list = text.replaceAll(" ", "").replaceAll("\\s", "")
                .chars()
                .mapToObj(element -> (char) element)
                .toList();

        list.forEach(stack::push);

        AtomicBoolean result = new AtomicBoolean(true);
        list.forEach(element -> {
            if (!stack.pop().equals(element)) {
                result.set(false);
            }
        });

        return result.get();

    }
}