package section_21.t_21_15;

import java.util.NoSuchElementException;

public class Queue<E>{
    private List<E> stackList;

    public Queue() {
        this.stackList = new List<E>("kolejka");
    }

    public E dequeue() throws NoSuchElementException {
        return stackList.removeFromFront();
    }

    public void enqueue(E object) {
        stackList.insertAtBack(object);
    }

    public boolean isEmpty(){
        return stackList.isEmpty();
    }

    public void print(){
        stackList.print();
    }

    public int getSize(){
        return this.stackList.getSize();
    }
}
