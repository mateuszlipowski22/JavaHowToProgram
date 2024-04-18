package section_21.t_21_8;

import java.util.NoSuchElementException;
import java.util.Objects;

public class SortedList<E extends Comparable<E>>{
    ListNode<E> firstNode;
    ListNode<E> lastNode;

    private String name;

    public SortedList() {
        this.name="lista";
    }

    public SortedList(String name) {
        this.name = name;
        this.firstNode=this.lastNode=null;
    }

    public void add(E insertItem){
        if(isEmpty()){
            firstNode=lastNode=new ListNode<>(insertItem);
        }else if(insertItem.compareTo(firstNode.data)<0){
            ListNode<E> newElement = new ListNode<>(insertItem,firstNode);
            firstNode=newElement;
        } else {
            ListNode<E> current = firstNode;

            while(Objects.nonNull(current.nextNode) && insertItem.compareTo(current.nextNode.data)>=0){
                current=current.nextNode;
            }

            ListNode<E> newElement = new ListNode<>(insertItem,current.nextNode);
            current.nextNode=newElement;

        }
    }

    public E removeFromFront(){
        if(isEmpty()){
            throw new NoSuchElementException(name + " jest pusta");
        }

        E removedItem = firstNode.data;
        if(firstNode==lastNode){
            firstNode=lastNode=null;
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

        E removedItem = lastNode.data;
        if(firstNode==lastNode){
            firstNode=lastNode=null;
        }
        else {
            ListNode<E> current = firstNode;

            while(current.nextNode!=lastNode){
                current=current.nextNode;
            }

            lastNode=current;
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

    public void merge(SortedList<E> secondList){
        ListNode<E> currentNode = secondList.firstNode;
        while (Objects.nonNull(currentNode)){
            add(currentNode.data);
            currentNode=currentNode.nextNode;
        }
    }
}
