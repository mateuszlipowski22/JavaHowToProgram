package section_21.t_21_25;

import java.security.SecureRandom;

public class TreeTest {
    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<Integer>();
        SecureRandom random = new SecureRandom();

        System.out.println("Wstawianie następujących wartości: ");
        random.ints(10,0,100)
                .forEach(element -> {
                    System.out.printf("%d ", element);
                    tree.insertNode(element);
                });

        System.out.printf("%n%nPrzejście poziomami%n");
        tree.levelOrder();

        System.out.printf("%n%nPokaż drzew%n");
        tree.outputTree();
    }
}
