package section_21.e_21_15;

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

        System.out.printf("%n%nPrzejście poprzeczne%n");
        tree.inorderTraversal();

        System.out.printf("%n%nPrzejście wsteczne%n");
        tree.postorderTraversal();
    }
}
