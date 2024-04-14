package section_21.e_21_9;

import section_21.e_21_3.*;

import java.util.NoSuchElementException;

public class Stack<E> {
    private List<E> stackList;

    public Stack() {
        this.stackList = new List<E>("stos");
    }

    public E pop() throws NoSuchElementException {
        return stackList.removeFromFront();
    }

    public void push(E object) {
        stackList.insertAtFront(object);
    }

    public boolean isEmpty(){
        return stackList.isEmpty();
    }

    public void print(){
        stackList.print();
    }
}
