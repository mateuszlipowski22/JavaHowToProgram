package section_21.t_21_23;

import java.util.Objects;


public class Tree<E extends Comparable<E>> {
    private TreeNode<E> root;

    public Tree() {
        this.root = null;
    }

    public void insertNode(E insertValue) {
        if (root == null) {
            root = new TreeNode<E>(insertValue);
        } else {
            root.insert(insertValue);
        }
    }

    public void preorderTraversal() {
        preorderHelper(root);
    }

    private void preorderHelper(TreeNode<E> node) {
        if (node == null) {
            return;
        }
        System.out.printf("%s ", node.data);
        preorderHelper(node.leftNode);
        preorderHelper(node.rightNode);
    }

    public void inorderTraversal() {
        inorderHelper(root);
    }

    private void inorderHelper(TreeNode<E> node) {
        if (node == null) {
            return;
        }
        preorderHelper(node.leftNode);
        System.out.printf("%s ", node.data);
        preorderHelper(node.rightNode);
    }

    public void postorderTraversal() {
        postorderHelper(root);
    }

    private void postorderHelper(TreeNode<E> node) {
        if (node == null) {
            return;
        }
        preorderHelper(node.leftNode);
        preorderHelper(node.rightNode);
        System.out.printf("%s ", node.data);
    }

    public TreeNode<E> contains(E data) {
        return containsHelper(root, data);
    }

    private TreeNode<E> containsHelper(TreeNode<E> node, E data) {
        System.out.println(data);
        System.out.println(node);
        if (node.data.equals(data)) {
            return node;
        } else {
            if (Objects.nonNull(node.leftNode) && node.data.compareTo(data) > 0) {
                return containsHelper(node.leftNode, data);
            }else if (Objects.nonNull(node.rightNode) && node.data.compareTo(data) < 0) {
                return containsHelper(node.rightNode, data);
            }else{
                return null;
            }
        }
    }
}
