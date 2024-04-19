package section_21.t_21_10;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Wpisz zdanie");
            Stack<String> stack = new Stack<>();
            Arrays.asList(scanner.nextLine().split(" ")).forEach(stack::push);

            System.out.println("Zdanie w odwrotnej kolejności");
            while(!stack.isEmpty()){
                System.out.printf("%s ",stack.pop());
            }

        } catch (Exception e) {
            System.out.println("Błąd podczas pobierania danych");
            e.printStackTrace();
        }
    }
}
