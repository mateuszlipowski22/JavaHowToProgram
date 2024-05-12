package section_21.t_21_25;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

class TreeNode<E extends Comparable<E>>{
    TreeNode<E> leftNode;
    E data;
    TreeNode<E> rightNode;

    public TreeNode(E data) {
        this.data = data;
        leftNode=rightNode=null;
    }

    public void insert(E insertValue){
        if(insertValue.compareTo(data)<0){
            if(leftNode==null){
                leftNode=new TreeNode<E>(insertValue);
            }else {
                leftNode.insert(insertValue);
            }
        }else if(insertValue.compareTo(data)>0){
            if(rightNode==null){
                rightNode=new TreeNode<E>(insertValue);
            }else {
                rightNode.insert(insertValue);
            }
        }
    }
}

public class Tree <E extends Comparable<E>>{
    private TreeNode<E> root;

    public Tree() {
        this.root = null;
    }

    public void insertNode(E insertValue){
        if(root==null){
            root = new TreeNode<E>(insertValue);
        }else {
            root.insert(insertValue);
        }
    }

    public void preorderTraversal(){
        preorderHelper(root);
    }

    private void preorderHelper(TreeNode<E> node){
        if(node==null){
            return;
        }
        System.out.printf("%s ", node.data);
        preorderHelper(node.leftNode);
        preorderHelper(node.rightNode);
    }

    public void inorderTraversal(){
        inorderHelper(root);
    }

    private void inorderHelper(TreeNode<E> node){
        if(node==null){
            return;
        }
        preorderHelper(node.leftNode);
        System.out.printf("%s ", node.data);
        preorderHelper(node.rightNode);
    }

    public void postorderTraversal(){
        postorderHelper(root);
    }

    private void postorderHelper(TreeNode<E> node){
        if(node==null){
            return;
        }
        preorderHelper(node.leftNode);
        preorderHelper(node.rightNode);
        System.out.printf("%s ", node.data);
    }

    public void levelOrder(){
        Queue<TreeNode<E>> queue = new LinkedList<>();
        queue.add(this.root);

        while (!queue.isEmpty()){
            TreeNode<E> currentNode = queue.poll();
            System.out.printf("%s ", currentNode.data);
            if(Objects.nonNull(currentNode.leftNode)){
                queue.add(currentNode.leftNode);
            }
            if(Objects.nonNull(currentNode.rightNode)){
                queue.add(currentNode.rightNode);
            }
        }
    }

    public void outputTree(){
        outputTreeHelper(root,0);
    }

    private void outputTreeHelper(TreeNode<E> node, int totalSpaces){
        if(Objects.nonNull(node)){
            outputTreeHelper(node.rightNode,totalSpaces+5);
            for(int i=1;i<totalSpaces;i++){
                System.out.printf(" ");
            }
            System.out.println(node.data);;
            outputTreeHelper(node.leftNode,totalSpaces+5);
        }
    }
}
