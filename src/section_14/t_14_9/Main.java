package section_14.t_14_9;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);

            System.out.println("Wpisz tekst do odwrócenia");
            String textToReverse = scanner.nextLine();

            Stack<String> stringStack = new Stack<>();

            Arrays.stream(textToReverse.split(" ")).forEach(s -> stringStack.push(String.valueOf(s)));
            System.out.println("Odwrócony tekst");
            while(!stringStack.isEmpty()){
                System.out.printf("%s ",stringStack.pop());
            }

        }catch (Exception e){
            System.out.println("Bład podczas odwracania kolejnosci "+e.getMessage());
        }
    }
}