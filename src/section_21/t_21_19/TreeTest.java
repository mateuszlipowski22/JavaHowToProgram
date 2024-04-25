package section_21.t_21_19;

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

        System.out.printf("%n%nPrzejście wzdłużne%n");
        tree.preorderTraversal();

        System.out.printf("%n%nGłębokość Drzew%n");
        System.out.println(tree.getDepth());

    }
}
