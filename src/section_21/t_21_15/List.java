package section_21.t_21_15;

import java.util.NoSuchElementException;

public class List <E>{
    private ListNode<E> firstNode;
    private ListNode<E> lastNode;

    private String name;

    public List() {
        this.name="lista";
    }

    public List(String name) {
        this.name = name;
        this.firstNode=this.lastNode=null;
    }

    public void insertAtFront(E insertItem){
        if(isEmpty()){
            firstNode=lastNode=new ListNode<>(insertItem);
        }else {
            firstNode=new ListNode<>(insertItem,firstNode);
        }
    }

    public void insertAtBack(E insertItem){
        if(isEmpty()){
            firstNode=lastNode=new ListNode<>(insertItem);
        }else {
            lastNode=lastNode.nextNode=new ListNode<>(insertItem);
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

    public int getSize(){
        if(isEmpty()){
            return 0;
        }

        int size=1;

        ListNode<E> current = firstNode;

        while(current!=null){
            size++;
            current=current.nextNode;
        }

        return size;
    }
}
