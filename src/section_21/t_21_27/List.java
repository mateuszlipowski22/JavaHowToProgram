package section_21.t_21_27;

import java.util.NoSuchElementException;
import java.util.Objects;

public class List <E>{
    private ListNode<E> firstNode;

    private String name;

    public List() {
        this.name="lista";
    }

    public List(String name) {
        this.name = name;
        this.firstNode=null;
    }

    public void insertAtFront(E insertItem){
        if(isEmpty()){
            firstNode=new ListNode<>(insertItem);
        }else {
            firstNode=new ListNode<>(insertItem,firstNode);
        }
    }

    public void insertAtBack(E insertItem){
        if(isEmpty()){
            firstNode=new ListNode<>(insertItem);
        }else {
            ListNode<E> currentNode = firstNode;
            while(Objects.nonNull(currentNode.nextNode)){
                currentNode=currentNode.nextNode;
            }
            currentNode.nextNode=new ListNode<>(insertItem);
        }
    }

    public E removeFromFront(){
        if(isEmpty()){
            throw new NoSuchElementException(name + " jest pusta");
        }

        E removedItem = firstNode.data;
        if(Objects.isNull(firstNode.nextNode)){
            firstNode=null;
        }
        else {
            firstNode=firstNode.nextNode;
        }

        return removedItem;
    }

    public E removeFromBack(){
        if(isEmpty()){
            throw new NoSuchElementException(name + " jest pusta");
        }

        ListNode<E> lastNode = firstNode;
        while(Objects.nonNull(lastNode.nextNode)){
            lastNode=lastNode.nextNode;
        }

        E removedItem = lastNode.data;
        if(firstNode==lastNode){
            firstNode=null;
        }
        else {
            ListNode<E> current = firstNode;

            while(current.nextNode!=lastNode){
                current=current.nextNode;
            }
            current.nextNode=null;
        }

        return removedItem;
    }

    public boolean isEmpty(){
        return firstNode==null;
    }

    public void print(){
        if(isEmpty()){
            System.out.printf("Pusta %s%n",name);
            return;
        }

        System.out.printf("%s zawiera: ",name);

        ListNode<E> current = firstNode;

        while(current!=null){
            System.out.printf("%s ",current.data);
            current=current.nextNode;
        }

        System.out.println();
    }
}
