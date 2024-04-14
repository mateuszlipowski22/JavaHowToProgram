package section_21.e_21_11;

import section_21.e_21_3.*;

import java.util.NoSuchElementException;

public class Queue <E>{
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
}
