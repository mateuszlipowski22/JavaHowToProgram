package section_21.t_21_17;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Tree<String> tree = new Tree<>();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Wpisz tekst");
            String text = scanner.nextLine();
            Arrays.asList(text.split(" "))
                    .forEach(tree::insertNode);

            tree.inorderTraversal();
            System.out.println();
            tree.postorderTraversal();
            System.out.println();
            tree.preorderTraversal();

        }catch (Exception e){
            System.err.println("Błąd podczas pobierania danych od użytkownika");
            e.printStackTrace();
        }
    }
}
