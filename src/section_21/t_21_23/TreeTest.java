package section_21.t_21_23;

import section_21.t_21_21.List;

import java.security.SecureRandom;
import java.util.Scanner;

public class TreeTest {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            Tree<Integer> tree = new Tree<Integer>();
            SecureRandom random = new SecureRandom();

            System.out.println("Wstawianie następujących wartości: ");
            random.ints(10,0,100)
                    .forEach(element -> {
                        System.out.printf("%d ", element);
                        tree.insertNode(element);
                    });

            System.out.printf("%n%nPrzejście wzdłużne%n");
            tree.preorderTraversal();

            System.out.printf("%n%nWpisz liczbę do wyszukania : ");
            Integer input = scanner.nextInt();

            System.out.println("tree.contains(input) = " + tree.contains(input));

        }catch (Exception e){
            System.err.println("Błąd podczas pobierania danych od użytkownika");
            e.printStackTrace();
        }
    }
}
